package vn.project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class NewPasswordController {
    @GetMapping("/newpass")
    public String index() {
        return "commons/newpass";
    }
}
