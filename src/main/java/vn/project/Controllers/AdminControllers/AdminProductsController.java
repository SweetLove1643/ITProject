package vn.project.Controllers.AdminControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminProductsController {
    @GetMapping("/admin/products")
    public String manageProducts(Model model) {
        // Lấy danh sách sản phẩm từ service
        // model.addAttribute("products", productService.getAllProducts());
        return "admin/products"; // Trỏ tới file Thymeleaf
    }
}
