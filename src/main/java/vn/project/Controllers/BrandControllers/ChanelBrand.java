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
@RequestMapping("/chanel")
public class ChanelBrand {

	@Autowired(required=true)
	IProductService productservice;

    @GetMapping
    public String index(Model model) {
    	
    	List<ProductsDTO> list = productservice.findbyBrandDTO("Chanel");
    	model.addAttribute("products", list);
        return "brands/chanelbrand";
    }
}