package vn.project.Controllers.Commons;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController{

	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping
	public String index() {	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println(((UserDetails)auth.getPrincipal()).getAuthorities());
		return "index";
	}
}