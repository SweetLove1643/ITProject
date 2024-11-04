package vn.project.Controllers.CustomerControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forgotpass")
public class ForgotPasswordController {

	@GetMapping
	
	public String index() {
		return "customer/forgotpass";
	}
}
