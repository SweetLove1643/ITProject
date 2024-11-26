package vn.project.Controllers.CategoryControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.project.DTO.ProductsDTO;
import vn.project.Service.IProductService;

import java.util.List;

@Controller
@RequestMapping("/allproduct")
public class AllProductController {

	@Autowired(required=true)
	IProductService productservice;

    @GetMapping
    public String index(Model model) {
    	
    	List<ProductsDTO> list = productservice.findbyCategoryDTO("Nam");
    	model.addAttribute("products", list);
        return "category/allproduct";
    }
}
