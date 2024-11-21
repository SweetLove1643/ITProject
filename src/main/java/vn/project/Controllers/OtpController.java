package vn.project.Controllers;

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

}
