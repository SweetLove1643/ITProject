package vn.project.Controllers.AdminControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductManagementController {
    @GetMapping("/promanage")
    public String manageProducts(Model model) {
        return "admin/productmanagement";
    }
}
