package vn.project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/favourite")
public class FavouriteController {

    @GetMapping("")

    public String index() {
        return "customer/favourite";
    }
}
