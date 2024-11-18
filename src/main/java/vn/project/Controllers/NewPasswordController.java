package vn.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.project.Service.IUserService;


@Controller
@RequestMapping("")

public class NewPasswordController {
	@Autowired
	private IUserService userService;
	  
    @GetMapping("/newpass")
    public String index() {
        return "commons/newpass";
    }
    
    @PostMapping("/newpass")
    public String processNewPassword(
            @RequestParam String email,
            @RequestParam String otp,
            @RequestParam String oldPassword,
            @RequestParam String newPassword,
            Model model) {
      
        var user = userService.findByEmail(email);
        
        if (user.isPresent()) {
            String sentOtp = (String) model.getAttribute("otp");
            var currentUser = user.get();
            
            if (otp.equals(sentOtp)) {
                if (currentUser.getPassword().equals(oldPassword)) {
                    currentUser.setPassword(newPassword);
                    userService.save(currentUser);
                    model.addAttribute("message", "Đổi mật khẩu thành công!");
                    return "commons/login";
                } else {
                    model.addAttribute("message", "Mật khẩu cũ không chính xác. Vui lòng thử lại.");
                    return "commons/newpass";
                }
            } else {
                model.addAttribute("message", "OTP không chính xác. Vui lòng thử lại.");
                return "commons/newpass";
            }
        } else {
            model.addAttribute("message", "Tài khoản không tồn tại.");
            return "commons/forgotpass";
        }
    }

}
