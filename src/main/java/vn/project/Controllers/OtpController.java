package vn.project.Controllers;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/otp")
public class OtpController {
	
	@PostMapping
	public String authentication(@ModelAttribute String codeotp, @RequestParam String otp) {
		if(otp.equals(codeotp)) {
			
		}
	}

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.project.Entity.Users;
import vn.project.Service.IUserService;

import java.util.Optional;


@Controller
@RequestMapping("")
public class OtpController {

	@GetMapping("/otp")
	public String home() {
		return "commons/otp";
	}
	
>>>>>>> 41599b26f3cf4725f177caec4ae312f1c0dff527
}
