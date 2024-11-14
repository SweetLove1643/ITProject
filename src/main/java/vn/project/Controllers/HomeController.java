package vn.project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController{

	@GetMapping("/home")
	public String home(Model model) {
        int[] items = {3, 3, 2, 1};
        model.addAttribute("owlItems", items);
        return "index"; 
    }
	
	@GetMapping
	public String index() {
		return "index";
	}



}
