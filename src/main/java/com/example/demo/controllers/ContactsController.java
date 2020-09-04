package com.example.demo.controllers;

import com.example.demo.data.entity.Contacts;
import com.example.demo.data.repository.ContactsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/contacts")
public class ContactsController {
    @Autowired
    private ContactsRepo contactsRepo;

    @GetMapping
    public Iterable<Contacts>getContacts(){return this.contactsRepo.findAll(); }
}
