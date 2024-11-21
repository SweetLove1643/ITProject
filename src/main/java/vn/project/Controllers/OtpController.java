package vn.project.Controllers;

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
	
}
