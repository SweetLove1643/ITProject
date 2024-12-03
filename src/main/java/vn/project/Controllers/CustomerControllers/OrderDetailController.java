package vn.project.Controllers.CustomerControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.project.DTO.ProductsDTO;
import vn.project.Entity.Orders;
import vn.project.Entity.Products;
import vn.project.Service.IOrderService;
import vn.project.Service.IProductService;

@Controller
@RequestMapping("/personal")
public class OrderDetailController {

    @Autowired
    IOrderService orderService;
    
    @Autowired
    IProductService productService;
    
    @GetMapping("/orderdetail/{id}")
    public String index(@PathVariable("id") String id, Model model) {

    	int orderid = Integer.parseInt(id);
        Orders order = orderService.findByOrderid(orderid);
        List<Products> listProducts = orderService.findAllProductByOrderId(orderid);
        List<ProductsDTO> listproduct = productService.ConvertProductToProductDTO(listProducts);
        
        model.addAttribute("listproduct", listproduct);
        model.addAttribute("order", order);
        return "customer/order-detail";
    }
}
