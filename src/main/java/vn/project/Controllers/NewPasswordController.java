package vn.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.project.DTO.ProductsDTO;
import vn.project.Service.IProductService;

import java.util.List;

@Controller
@RequestMapping("")
public class NewPasswordController {
    @GetMapping("/newpass")
    public String index() {
        return "commons/newpass";
    }
}
