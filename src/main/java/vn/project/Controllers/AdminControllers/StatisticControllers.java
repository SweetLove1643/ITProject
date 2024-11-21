package vn.project.Controllers.AdminControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.project.Entity.Statistic;
import vn.project.Service.Impl.StatisticService;

import java.util.List;

@RestController
@RequestMapping("/statistics")
public class StatisticControllers {

    @Autowired(required=true)
    private StatisticService statisticService;

    @GetMapping
    public String index(Model model) {
    	 List<Statistic> statistics = statisticService.findAll();
         model.addAttribute("statistics", statistics);
        return "admin/statistics";
    }
}
