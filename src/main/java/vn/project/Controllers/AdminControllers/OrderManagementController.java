package vn.project.Controllers.AdminControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.project.Entity.Orders;
import vn.project.Service.IOrderService;

@Controller
@RequestMapping("/admin")
public class OrderManagementController {

	@Autowired
	IOrderService orderService;

	@GetMapping("/ordermanager")
	public String manageProducts(Model model) {
		try {
			List<Orders> listorder = orderService.findAll();
			model.addAttribute("listorders", listorder);
			return "admin/ordermanagement";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/403";
		}

	}

	@PostMapping("/ordermanager/update")
	public String updateOrder(@RequestParam("orderid") int orderId,
			@RequestParam("deliverystatus") String deliveryStatus, Model model) {
		Orders order = orderService.findById(orderId).get();
		String status = "Đang xử lí";
		if (order != null) {
			
			switch (deliveryStatus) {
			case "Shipping": {
				status = "Đang giao hàng";
				break;
			}
			case "Delivered": {
				status = "Đã giao";
				break;
			}
			case "Cancelled": {
				status = "Đã hủy";
				break;
			}
			case "Pending": {
				status = "Đang xử lí";
				break;
			}
			default:
				model.addAttribute("Message", "Chỉnh sửa thất bại");
				return "redirect:/admin/ordermanager";
			}
			order.setDeliverystatus(status);
			orderService.save(order);
		}

		return "redirect:/admin/ordermanager";
	}

}
