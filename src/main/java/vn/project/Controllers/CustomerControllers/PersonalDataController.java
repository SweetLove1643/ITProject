package vn.project.Controllers.CustomerControllers;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import vn.project.DTO.CartDTO;
import vn.project.Entity.Roles;
import vn.project.Entity.Users;
import vn.project.Service.ICartService;
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

	@GetMapping("/profile")
	public String profile(HttpSession session, Model model) {

	    Optional<Users> user = Optional.empty();

	    Object useridObj = session.getAttribute("userid");
	    if (useridObj != null) {
	        String useridString = String.valueOf(useridObj).trim();

	        if (!useridString.isEmpty() && !"null".equals(useridString)) {
	            try {
	                int userid = Integer.parseInt(useridString);
	                user = userService.findById(userid);
	            } catch (NumberFormatException e) {
	                System.err.println("Invalid userid format in session: " + useridString);
	            }
	        }
	    }

	    if (user.isPresent()) {
	        Users userPresent = user.get();
	        String roleUser = "Không xác định";

	        // Lấy role user nếu có
	        Optional<Roles> role = roleService.findById(userPresent.getRoleid());
	        if (role.isPresent()) {
	            Roles rolePresent = role.get();
	            roleUser = rolePresent.getRolename();
	        }

	        // Gửi dữ liệu về view
	        model.addAttribute("user", userPresent);
	        model.addAttribute("userrole", roleUser);
	    } else {
	        // Xử lý trường hợp không tìm thấy user
	        model.addAttribute("error", "User không tồn tại hoặc không được đăng nhập.");
	    }

	    return "customer/personaldata";
	}


	@GetMapping("/cart")
	public String cart(HttpSession session, Model model) {
		
		List<CartDTO> cartuser = new ArrayList<>();
		
		Object useridObj = session.getAttribute("userid");
		if(useridObj != null) {
			String useridString = String.valueOf(useridObj).trim();
			
			if(!useridString.isEmpty() || !"null".equals(useridString)) {
				try {
					int userid = Integer.parseInt(useridString);
					cartuser = cartService.findByUserid(userid);
	            } catch (NumberFormatException e) {
	                e.printStackTrace();
	            }
			}
		}
		
		
		if (cartuser != null) {
			model.addAttribute("usercart", cartuser);
		} else {
			model.addAttribute("message", "Không có sản phẩm nào.");
		}

		return "customer/cart";
	}

	@GetMapping("/changepassword")
	public String changepassword() {
		return "customer/changepassword";
	}

	@GetMapping("/orders")
	public String orders() {
		return "customer/orders";
	}
}
