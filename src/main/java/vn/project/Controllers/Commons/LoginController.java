package vn.project.Controllers.Commons;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
	    try {
	        boolean isAuthenticated = false;
	        Optional<Users> optionalUser = userservice.findByUsername(username);
	        
	        if (optionalUser.isPresent()) {
	        	
	            Users u = optionalUser.get();
	            if (passwordEncoder.matches(password, u.getPassword())) {
	                isAuthenticated = true;
	            }
	            return "redirect:/505";
	        }
	        
	        if (isAuthenticated) {
	            redirectAttributes.addFlashAttribute("message", "Đăng nhập thành công!");
	            return "redirect:/home";
	        } else {
	            return "redirect:/login";
	        }
	    } catch (Exception e) {
	        redirectAttributes.addFlashAttribute("message", "Có lỗi đã xảy ra");
	        return "redirect:/505";
	    }
	}


}