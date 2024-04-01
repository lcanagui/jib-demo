package fr.iamludal.jibdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CarsController {
    @GetMapping("/cars")
    public List<String> getCars() {
        return Arrays.asList("Renault", "Peugeot", "Citroen");
    }
}
