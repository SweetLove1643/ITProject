package vn.project.Controllers.CustomerControllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.project.Entity.Orders;
import vn.project.Service.IOrderService;

@Controller
@RequestMapping("/personal")
public class OrderDetailController {

    @Autowired
    IOrderService orderService;
    @GetMapping("/orderdetail/{id}")
    public String index(@PathVariable("id") String orderid, Model model) {

        Orders order = orderService.findByOrderid(Integer.parseInt(orderid));
        model.addAttribute("order", order);
        return "customer/order-detail";
    }
}
