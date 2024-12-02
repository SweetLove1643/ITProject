package vn.project.Controllers.CustomerControllers;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.project.Entity.Users;
import vn.project.Service.IUserService;

@Controller
@RequestMapping("/personal")
public class CheckoutController {
	
	@Autowired
	IUserService userService;

    @GetMapping("/checkout")
    public String index(Model model) {
    	
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	UserDetails userDetail = (UserDetails)auth.getPrincipal();
    	Optional<Users> optinal = userService.findByUsername(userDetail.getUsername());
    	Users user = optinal.isPresent() ? optinal.get() : null;
    	
		if(user == null) { return "redirect:/exception/403"; }
		 
    	
    	model.addAttribute("user", user);
    	
    	return "customer/checkout";
    }
}
