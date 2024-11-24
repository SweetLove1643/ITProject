package vn.project.Controllers.AdminControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccUserController {
    @GetMapping("/usermanage")
    public String manageProducts(Model model) {
        return "admin/accusermanagement";
    }
}
