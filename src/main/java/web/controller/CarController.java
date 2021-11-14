package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.ServiceCar;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private ServiceCar serviceCar;

    @GetMapping("/cars")
    public String getAllCars(@RequestParam(name = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("allCars",serviceCar.allCars(count));
        return "getListCars";
    }
}
