package com.example.my_final_project.controllers;

import com.example.my_final_project.models.AdvertModel;
import com.example.my_final_project.repos.AdvertRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/advert")
public class AdvertController {
    final
    AdvertRepository advertRepository;

    public AdvertController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }

    @GetMapping("/{id}")
    public String getAdvert(Model model, @PathVariable long id){
        Optional<AdvertModel> advertModel = advertRepository.findById(id);
        model.addAttribute("advert", advertModel);
        return "advert";
    }
}
