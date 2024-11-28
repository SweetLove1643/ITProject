package vn.project.Controllers.CustomerControllers;

import java.util.ArrayList;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.transaction.Transactional;
import vn.project.DTO.CartDTO;
import vn.project.Entity.Cart;
import vn.project.Entity.Orders;
import vn.project.Entity.Users;
import vn.project.Service.ICartService;
import vn.project.Service.IOrderService;
import vn.project.Service.IRoleService;
import vn.project.Service.IUserService;

@Controller
@RequestMapping("/personal")
public class PersonalDataController {

	@Autowired
	IUserService userService;

	@Autowired
	IRoleService roleService;

	@Autowired
	ICartService cartService;

	@Autowired
	IOrderService orderService;

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@GetMapping("/profile")
	public String profile(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (auth != null && auth.isAuthenticated() && !(auth.getPrincipal() instanceof String)) {
			Object principal = auth.getPrincipal();

			if (principal instanceof UserDetails) {
				UserDetails userDetails = (UserDetails) principal;
				Users user = userService.findByUsername(userDetails.getUsername()).orElse(null);

				if (user != null) {
					model.addAttribute("user", user);
					return "customer/personaldata";
				}
			}
		}

		model.addAttribute("message", "Vui lòng đăng nhập");
		return "redirect:/login";
	}

	@PostMapping("profile/update")
	public String updateprofile(@ModelAttribute Users user, Model model) {
		try {

			Optional<Users> emailuser = userService.findByEmail(user.getEmail());

			if (emailuser.isPresent() && user.getEmail().equals(emailuser.get().getEmail())) {
				model.addAttribute("message", "Email đã tồn tại.");
				return "redirect:/personal/profile";
			}

			user.setPassword(userService.findById(user.getId()).get().getPassword());

			model.addAttribute("message", "Cập nhật thành công");
			userService.save(user);
			return "redirect:/personal/profile";

		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/404";
		}

	}

	@GetMapping("/changepassword")
	public String changepassword(Model model) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UserDetails userdetail = (UserDetails)auth.getPrincipal();
		
		Users user = userService.findByUsername(userdetail.getUsername()).get();
		model.addAttribute("user", user);
		return "customer/changepassword";
	}

	@PostMapping("/changepassword")
	public String postMethodName(@RequestParam String currentpassword, @RequestParam String newpassword,
			@RequestParam String confirmpassword, Model model) {
		try {

			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			UserDetails userdetail = (UserDetails) auth.getPrincipal();

			if (auth.isAuthenticated()) {
				Users user = userService.findByUsername(userdetail.getUsername()).get();

				Boolean authentication = passwordEncoder.matches(currentpassword, user.getPassword());

				if (authentication) {
					if (newpassword.equals(confirmpassword)) {

						user.setPassword(passwordEncoder.encode(newpassword));
						userService.save(user);

						return "redirect:/personal/changepassword";
					}
				} else {
					model.addAttribute("message", "Sai mật khẩu cu");
					return "redirect:/personal/changepassword";
				}
			} else {
				return "redirect:/login";
			}

		} catch (Exception e) {
			;
			model.addAttribute("message", "Đã xảy ra lỗi");
			return "redirect:/anyerror";
		}

		return null;
	}

	@GetMapping("/cart")
	public String cart(Model model) {
		try {
			List<CartDTO> cartuser = new ArrayList<>();

			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			UserDetails userDetails = (UserDetails)auth.getPrincipal();
			Users user = userService.findByUsername(userDetails.getUsername()).get();
			
			cartuser = cartService.findByUserid(user.getId());

			if (cartuser == null) {
				model.addAttribute("message", "Không có sản phẩm nào.");
			}
			model.addAttribute("user", user);
			model.addAttribute("usercart", cartuser);

			return "customer/cart";
		}catch (Exception e) {
			e.printStackTrace();
			return "redirect:/anyerror";
		}
		
	}

	@Transactional
	@GetMapping("/cart/delete/{id}")
	public String deletecart(@PathVariable("id") int cartid) {

		cartService.deleteByCartid(cartid);

		return "redirect:/personal/cart";
	}
	
	@GetMapping("/cart/add/{id}")
	public String addproduct(@PathVariable String id, RedirectAttributes redirectAttributes) {
		
		try {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			UserDetails userauth = (UserDetails)auth.getPrincipal();
			Users user = userService.findByUsername(userauth.getUsername()).get();
			
			Optional<Cart> cartcheck = cartService.findByUseridAndProductid(user.getId(), Integer.valueOf(id));
			
			if(cartcheck.isPresent()) {
				Cart editcart = cartcheck.get();
				editcart.setQuantity(editcart.getQuantity() + 1);
				cartService.save(editcart);
				redirectAttributes.addFlashAttribute("message", "Thêm sản phẩm thành công");
				return "redirect:/productdetail/" +  id;
			}else {
				Cart newcart = Cart.builder().userid(user.getId()).productid(Integer.valueOf(id)).quantity(1).build();
				cartService.save(newcart);
				redirectAttributes.addFlashAttribute("message", "Thêm sản phẩm thành công");
				return "redirect:/productdetail/" +  id;
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			redirectAttributes.addFlashAttribute("message", "Đã xảy ra lỗi");
			return "redirect:/anyerror";
		}
	}

	@GetMapping("/orders")
	public String orders(Model model) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UserDetails userDetails = (UserDetails)auth.getPrincipal();
		Users user = userService.findByUsername(userDetails.getUsername()).get();
		
		List<Orders> order = orderService.findByUserid(user.getId());

		model.addAttribute("orders", order);
		model.addAttribute("user", user);
		return "customer/orders";
	}
}
