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
@RequestMapping("/login")
public class LoginController {

	

	@Autowired
	IUserService userservice;
	
	@GetMapping("")
	public String index() {
		return "customer/login";
	}
	
	@PostMapping("")
    public String login(@RequestParam String email, 
                        @RequestParam String password, 
                        Model model) {
		boolean isAuthenticated = false;
        // Xử lí logic
		
		Optional<Users> optinalusers = userservice.findByUsername(email);
		
		  if(!optinalusers.isEmpty()) { Users u = optinalusers.get();
		  
		  
		  if(u.getPassword().equals(password)) { isAuthenticated = true; } }
		 		
        
        if (isAuthenticated) {
            model.addAttribute("message", "Đăng nhập thành công!");
            return "customer/home";
        } else {
            model.addAttribute("error", "Email hoặc mật khẩu không đúng!");
            return "customer/login";
        }
    }
	
}