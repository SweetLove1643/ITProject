package vn.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.project.Entity.Users;
import vn.project.Service.IUserService;

@Controller
@RequestMapping

public class NewPasswordController {
	@Autowired
	private IUserService userService;

	private String usermail;

	@GetMapping("/newpass")
	public String index(@ModelAttribute("verifysuccess") String verifysuccess,
			@ModelAttribute("useremail") String useremail) {
		if (verifysuccess.equals("true")) {
			this.usermail = useremail;
			return "commons/newpass";
		}else {
			return "redirect:/forgotpass";
		}
	}

	@PostMapping("/newpass")
	public String processNewPassword(@RequestParam String newpass,
			@RequestParam String renewpass, Model model) {

		if(newpass.equals(renewpass) == false) {
			model.addAttribute("message", "Vui lòng nhập lại mật khẩu mới!");
			return "commons/newpass";
		}

		return null;
	}

}
