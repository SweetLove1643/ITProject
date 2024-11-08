package vn.project.Controllers;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@GetMapping
	public String index() {
		return "customer/register";
	}
	@PostMapping
	public String register(@RequestParam String username,
							@RequestParam String password,
							@RequestParam String fullname,
							@RequestParam String phonenumber,
							@RequestParam String email,
							@RequestParam String address,
							@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate birthday,
							@RequestParam String sex,
							@RequestParam(defaultValue = "false") boolean agreement,
							Model model
			) {
		int ageyear = birthday.getYear();
		if(username.isEmpty() || password.isEmpty() || fullname.isEmpty() || phonenumber.isEmpty() || email.isEmpty() || address.isEmpty() || sex.isEmpty() || ageyear > 2023 || ageyear < 1950 ) {
			model.addAttribute("message", "Vui lòng điền đủ thông tin");
		}
		return null;
	}
	
	
}
