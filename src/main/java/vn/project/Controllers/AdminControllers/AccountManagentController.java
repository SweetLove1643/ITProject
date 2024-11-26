package vn.project.Controllers.AdminControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    
    @PostMapping("/accountmanager/update/{id}")
    public String accountupdate() {
 
    	
    	return null;
    }
}
