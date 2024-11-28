package vn.project.Controllers.BrandControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.project.DTO.ProductsDTO;
import vn.project.Service.IProductService;

@Controller
@RequestMapping("/dior")
public class DiorBrand {

	@Autowired(required=true)
	IProductService productservice;

    @GetMapping
    public String index(Model model) {

    	List<ProductsDTO> list = productservice.findbyBrandDTO("dior");
    	model.addAttribute("products", list);
        return "brands/diorbrand";
    }
}
