package vn.project.Controllers;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.project.Entity.Users;
import vn.project.Service.IUserService;


@Controller
@RequestMapping("/forgotpass")
public class ForgotPasswordController {

	@Autowired(required = true)
	IUserService userService;
	@GetMapping
	public String index() {
		return "commons/forgotpass";
	}
	
	@PostMapping("/otp")
	public String inputOTP(@RequestParam String email, Model model) {
		Optional<Users> u = userService.findByEmail(email);
		if(u.isPresent()) {
			
			
			return "forgotpass";
		}else {
			model.addAttribute("message", "Tài khoản không tồn tại");
			return "redirect:/forgotpass";
		}
	}
	
}
