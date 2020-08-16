package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getCars(@ModelAttribute("locale") String locale,
                          ModelMap model){
        String loc = new String();
        if (locale.equals("ru")){
            loc = "Машины";
        }else if (locale.equals("en")){
            loc = "Cars";
        }

        List<Car> carList = carService.getCars();
        model.addAttribute("cars", carList);
        model.addAttribute("loc", loc);
        return "cars";
    }
}
