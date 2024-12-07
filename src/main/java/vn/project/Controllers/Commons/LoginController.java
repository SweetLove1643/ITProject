package vn.project.Controllers.Commons;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import vn.project.DTO.CartDTO;
import vn.project.Entity.Users;
import vn.project.Service.ICartService;
import vn.project.Service.IUserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	IUserService userservice;
	
	@Autowired
	ICartService cartService;

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@GetMapping
	public String index() {
		return "commons/login";
	}

	@PostMapping
	public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes,HttpSession session) {
	    try {
	        boolean isAuthenticated = false;
	        Optional<Users> optionalUser = userservice.findByUsername(username);
	        
	        if (optionalUser.isPresent()) {
	        	
	            Users u = optionalUser.get();
	            if (passwordEncoder.matches(password, u.getPassword())) {
	                isAuthenticated = true;
	                
	            }else {
	            	return "redirect:/505";
	            }
	            
	        }
	        
	        if (isAuthenticated) {
	        	cartheader(session);	
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

	public void cartheader(HttpSession session) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth.isAuthenticated()) {
			UserDetails userDetail = (UserDetails)auth.getPrincipal();
			Optional<Users> present = userservice.findByUsername(userDetail.getUsername());
			if(present.isPresent()) {
				Users user = present.get();
				List<CartDTO> usercart = cartService.findByUserid(user.getId());
				long totalprice = 0;
				for(CartDTO cart : usercart) {
					totalprice = totalprice + (Integer.parseInt(cart.getPrice()) * Integer.parseInt(cart.getQuantity()));
				}
				session.setAttribute("usercart", usercart);
				session.setAttribute("totalprice", totalprice);
			}
		}
	}

}