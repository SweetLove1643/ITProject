package vn.project.Controllers.CustomerControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/personaldata")
public class PersonalDataController {
	
	

    @GetMapping("/cart")
    public String index(HttpSession sesstion) {
    	int userid = Integer.valueOf((String)sesstion.getAttribute("userid"));
    	
        return "customer/personaldata";
    }
    
    
}
