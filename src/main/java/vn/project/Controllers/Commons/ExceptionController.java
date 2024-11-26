package vn.project.Controllers.Commons;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ExceptionController {

	@GetMapping("/403")
	public String view403() {
		return "commons/403";
	}
}
