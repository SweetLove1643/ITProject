package vn.project.Controllers.CategoryControllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.project.DTO.ProductsDTO;
import vn.project.Service.IProductService;

@Controller
@RequestMapping("/productdetail")
public class ProductDetailController {

	@Autowired(required = true)
	IProductService productService;

	@GetMapping
	public String index(/*@RequestParam String productid,*/ Model model) {
		try {
			/*int id = Integer.valueOf(productid);*/
			ProductsDTO product = productService.findbyIdDTO(4);
			model.addAttribute("products", product);
			return "category/productdetail";
			
		} catch (Exception e) {
			model.addAttribute("message", "Đã xảy ra lỗi");
			return "redirect:/505";
		}
	}
}
