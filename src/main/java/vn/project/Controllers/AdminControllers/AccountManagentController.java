package vn.project.Controllers.AdminControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.project.Entity.Users;
import vn.project.Service.IRoleService;
import vn.project.Service.IUserService;

@Controller
@RequestMapping("/admin")
public class AccountManagentController {

	@Autowired
	IUserService userService;

	@Autowired
	IRoleService roleService;

    @GetMapping("/accountmanager")
    public String manageProducts(Model model) {
    	List<Users> accountlist = userService.findAll();
    	model.addAttribute("userlist", accountlist);
    	model.addAttribute("roles", roleService.findAll());
        return "admin/accusermanagement";
    }

    @PostMapping("/accountmanager/update")
    public String accountupdate(@RequestParam String userid ,@ModelAttribute Users user, Model model) {

    	try {
    		int id = Integer.valueOf(userid);
    		Users u = userService.findById(id).get();
    		user.setId(id);
    		user.setPassword(u.getPassword());
    		user.setRole(u.getRole());
			 userService.save(user);
    		model.addAttribute("message", "Cập nhật thành công.");
    		return "redirect:/admin/accountmanager";
    	}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "Cập nhật thất bại.");
    		return "redirect:/admin/accountmanager";
		}
    }
}
