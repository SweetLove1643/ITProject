package vn.project.Controllers.Commons;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import vn.project.DTO.CartDTO;
import vn.project.Entity.Users;
import vn.project.Service.ICartService;
import vn.project.Service.IUserService;

@Controller
@RequestMapping
public class HomeController{

	@Autowired
	IUserService userService;
	
	@Autowired
	ICartService cartService;
	
	@GetMapping({"/home", "/"})
	public String home(Model model, HttpSession session) {
		try {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			if(auth.isAuthenticated()) {
				UserDetails userDetail = (UserDetails)auth.getPrincipal();
				Optional<Users> present = userService.findByUsername(userDetail.getUsername());
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
			
			return "index";
			
		}catch (Exception e) {
			// TODO: handle exception
			return "redirect:/exception/anyerror";
		}
		
	}

	
}
