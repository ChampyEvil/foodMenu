package com.example.foodMenu;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class FoodMenuController {
    @GetMapping("/getFastFoodMenu")
    public List<FoodItem> getFastFoodMenu() {
        List<FoodItem> menu = Arrays.asList(
                new FoodItem("Basil with Crispy", 50),
                new FoodItem("Chicken Basil", 45),
                new FoodItem("Crispy Pork Kale", 50),
                new FoodItem("Shrimp Curry Powder", 50),
                new FoodItem("Meat Curry Powder", 50)
        );
        return menu;
    }

    @GetMapping("/getNoodleMenu")
    public List<FoodItem> getNoodleMenu() {
        List<FoodItem> menu = Arrays.asList(
                new FoodItem("Pork Noodles", 40),
                new FoodItem("Beef Noodles", 40),
                new FoodItem("Tom Yum Noodles", 40),
                new FoodItem("Rice", 10)
        );
        return menu;
    }

    @GetMapping("/getFriedMenu")
    public List<FoodItem> getFriedMenu() {
        List<FoodItem> menu = Arrays.asList(
                new FoodItem("Fried Beef with Garlic and Pepper", 50),
                new FoodItem("Fried Pork with Garlic and Pepper", 40),
                new FoodItem("Pork Belly Fried with Garlic", 50),
                new FoodItem("Fried Squid with Garlic", 50)
        );
        return menu;
    }

    @GetMapping("/getFriedRiceMenu")
    public List<FoodItem> getFriedRiceMenu() {
        List<FoodItem> menu = Arrays.asList(
                new FoodItem("Crab Fried Rice", 50),
                new FoodItem("Seafood Fried Rice", 50),
                new FoodItem("Mixed Fried Rice", 50),
                new FoodItem("Mackerel Fried Rice", 40)
        );
        return menu;
    }

    @GetMapping("/getEggMenu")
    public List<FoodItem> getEggMenu() {
        List<FoodItem> menu = Arrays.asList(
                new FoodItem("Minced Pork Omelet", 50),
                new FoodItem("Fried Omelet with Cha-Om", 50),
                new FoodItem("Fried Egg", 10),
                new FoodItem("Boiled egg", 10)
        );
        return menu;
    }

    @GetMapping("/getWithoutRiceMenu")
    public List<FoodItem> getWithoutRiceMenu() {
        List<FoodItem> menu = Arrays.asList(
                new FoodItem("Mixed Tom Yum", 80),
                new FoodItem("Tom Yum Seafood", 100),
                new FoodItem("Spicy Mixed Salad", 80)
        );
        return menu;
    }
}
