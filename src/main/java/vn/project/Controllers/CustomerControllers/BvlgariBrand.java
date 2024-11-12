package vn.project.Controllers.CustomerControllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.project.DTO.ProductsDTO;
import vn.project.Service.IProductService;

@Controller
@RequestMapping("/bvlgari")
public class BvlgariBrand {

	@Autowired(required=true)
	IProductService productservice;

    @GetMapping
    public String index(Model model) {
    	
    	List<ProductsDTO> list = productservice.findbyBrandDTO("Bvlgari");
    	System.out.println(list);
    	model.addAttribute("products", list);
        return "customer/bvlgaribrand";
    }
}
