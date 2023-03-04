package com.example.my_final_project.controllers;

import com.example.my_final_project.models.AdvertModel;
import com.example.my_final_project.repos.AdvertRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/addAdvert")
public class AddAdvertController {
    final
    AdvertRepository advertRepository;
    public AddAdvertController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }

    @PostMapping
    public String postData(@RequestParam String name, @RequestParam String price,
                           @RequestParam String weight, @RequestParam String disc,@RequestParam String length,
                           @RequestParam String width, @RequestParam String height){
        AdvertModel advertModel = new AdvertModel();
        advertModel.setName(name);
        advertModel.setPrice(price);
        advertModel.setWeight(weight);
        advertModel.setDisc(disc);
        advertModel.setLength(length);
        advertModel.setWidth(width);
        advertModel.setHeight(height);
        advertRepository.save(advertModel);
        return "aboutus";
    }

    @GetMapping
    public String addAdvert() {
        return "addAdvert";
    }


}
