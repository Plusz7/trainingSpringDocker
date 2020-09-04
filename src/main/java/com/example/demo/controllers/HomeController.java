package com.example.demo.controllers;

import com.example.demo.data.repository.CustomersRepo;
import com.example.demo.services.CSVService;
import com.example.demo.utility.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {

    @Autowired
    CSVService csvService;
    @Autowired
    CustomersRepo customersRepo;

    @GetMapping(name = "/")
    public String homePage(){ return "index"; }

    @PostMapping(value = "/upload")
    public String fileUpload(@RequestParam("file") MultipartFile file, Model model){

        if (Helper.hasCSVFormat(file)) {
            try {
                csvService.save(file);

                model.addAttribute("allCustomers", customersRepo.findAll());
                return "customers";
            } catch (Exception e) {
                return "error";
            }
        }
        return "error";
    }



}
