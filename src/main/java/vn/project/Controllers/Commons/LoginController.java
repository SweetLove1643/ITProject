package vn.project.Controllers.Commons;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.project.Entity.Users;
import vn.project.Service.IUserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	IUserService userservice;

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@GetMapping
	public String index() {
		return "commons/login";
	}

	@PostMapping
	public String login(@RequestParam String username, @RequestParam String password, Model model) {
		try {
			boolean isAuthenticated = false;

			Optional<Users> optinalusers = userservice.findByUsername(username);

			if (!optinalusers.isEmpty()) {
				Users u = optinalusers.get();

				if (passwordEncoder.matches(u.getPassword(), password))
						{
					isAuthenticated = true;
				}
			}

			if (isAuthenticated) {
				model.addAttribute("message", "Đăng nhập thành công!");
				return "redirect:/home";
			} else {
				model.addAttribute("message", "Email hoặc mật khẩu không đúng!");
				return "redirect:/login";
			}
		}catch (Exception e) {
			model.addAttribute("message", "Có lỗi đã xảy ra");
			return "redirect:/login";
		}

	}

}