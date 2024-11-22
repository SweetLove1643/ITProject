package vn.project.Controllers.AdminControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminOrdersController {
    @GetMapping("/admin/orders")
    public String manageOrders(Model model) {
        // Lấy danh sách đơn hàng từ service
        // model.addAttribute("orders", orderService.getAllOrders());
        return "admin/orders"; // Trỏ tới file Thymeleaf
    }
}
