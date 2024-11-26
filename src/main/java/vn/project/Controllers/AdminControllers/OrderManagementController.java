package vn.project.Controllers.AdminControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class OrderManagementController {
    @GetMapping("/ordermanager")
    public String manageProducts(Model model) {
        return "admin/ordermanagement";
    }
}
