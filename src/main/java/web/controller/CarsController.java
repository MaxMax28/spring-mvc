package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getListCars (Model model) {
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car(1, "bmw", 111));
//        cars.add(new Car(2, "lada", 222));
//        cars.add(new Car(3, "ford", 333));
//        model.addAttribute("cars", cars);

//        List<String> cars = new ArrayList<>();
//        cars.add("Hello!");
//        model.addAttribute("cars", cars);

        List<String> messages = new ArrayList<>();
        messages.add("GoodBye!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);

        return "index";
    }
}
