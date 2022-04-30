package com.example.able_contact_sync.controller;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 29-04-2022
 */

import com.example.able_contact_sync.model.ContactDetail;
import com.example.able_contact_sync.model.InputModel;
import com.example.able_contact_sync.model.ResponseModel;
import com.example.able_contact_sync.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contact {

    @Autowired
    ContactService contactService;

    @GetMapping("/api/v1/check")
    public ResponseModel check(){
        return new ResponseModel("Working");
    }

    @PostMapping("/api/v1/saveContact")
    public ResponseModel saveContact(@RequestBody InputModel inputModel){
        return contactService.saveContact(inputModel);
    }

    @PostMapping("/api/v1/saveOneContact")
    public ResponseModel saveOneContact(@RequestBody ContactDetail contactDetail){
        return contactService.saveOneContact(contactDetail);
    }

    @GetMapping("/api/v1/getAllContact")
    public InputModel getAllContact(){
        return contactService.getAllContact();
    }
}
