package vn.project.Controllers;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.project.Entity.Users;
import vn.project.Service.IUserService;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	IUserService userService;

	@GetMapping
	public String index() {
		return "commons/register";
	}

	@PostMapping
	public String register(@RequestParam String username, @RequestParam String password, @RequestParam String fullname,
			@RequestParam String phonenumber, @RequestParam String email, @RequestParam String address,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate birthday, @RequestParam String sex,
			@RequestParam(defaultValue = "false") boolean agreement, Model model) {
		int ageyear = birthday.getYear();
		if (username.isEmpty() || password.isEmpty() || fullname.isEmpty() || phonenumber.isEmpty() || email.isEmpty()
				|| address.isEmpty() || sex.isEmpty() || ageyear > 2023 || ageyear < 1950) {
			SaveOldInfo(username, password, fullname, phonenumber, email, address, sex, sex, model);
			model.addAttribute("message", "Vui lòng điền đủ thông tin");
		} else {
			Optional<Users> user = userService.findByUsername(username);
			Optional<Users> user1 = userService.findByEmail(email);
			Optional<Users> user2 = userService.findByPhonenumber(phonenumber);

			if (user.isPresent()) {
				model.addAttribute("message", "Username này đã tồn tại");
				SaveOldInfo(username, password, fullname, phonenumber, email, address, sex, sex, model);
				return "commons/register";
			}
			if (user1.isPresent()) {
				model.addAttribute("message", "Email này đã được sử dụng");
				SaveOldInfo(username, password, fullname, phonenumber, email, address, sex, sex, model);
				return "commons/register";
			}
			if (user2.isPresent()) {
				model.addAttribute("message", "Số điện thoại này đã được sử dụng");
				SaveOldInfo(username, password, fullname, phonenumber, email, address, sex, sex, model);
				return "commons/register";
			}
			
			if(agreement == false) {
				model.addAttribute("message", "Vui lòng đồng ý với điều khoản");
				SaveOldInfo(username, password, fullname, phonenumber, email, address, sex, sex, model);
				return "commons/register";
			}
		}
		Users newUser = Users.builder().username(username).password(password).fullname(fullname)
				.phonenumber(phonenumber).email(email).address(address).roleid(1).build();
		userService.save(newUser);
		model.addAttribute("message", "Tạo tài khoản thành công");
		return "redirect:/login";
	}
	
	public void SaveOldInfo(String username, String password, String fullname, String phonenumber, String email, String address, String sex, String birthday, Model model) {
        model.addAttribute("username", username);   
        model.addAttribute("password", password);   
        model.addAttribute("fullname", fullname);  
        model.addAttribute("phonenumber", phonenumber); 
        model.addAttribute("email", email);  
        model.addAttribute("address", address);  
        model.addAttribute("sex", sex); 
        model.addAttribute("birthday", birthday);
	}

}
