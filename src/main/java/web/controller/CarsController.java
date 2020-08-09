package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getListCars (@RequestParam(defaultValue = "Cars") String locale, Model model) {
        if (locale.equalsIgnoreCase("ru")) {
            locale = "МАШИНЫ";
        } else locale = "Cars";

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "bmw", 111));
        cars.add(new Car(2, "lada", 222));
        cars.add(new Car(3, "ford", 333));
        model.addAttribute("cars", cars);
        model.addAttribute("title", locale);
        return "cars";
    }
}
