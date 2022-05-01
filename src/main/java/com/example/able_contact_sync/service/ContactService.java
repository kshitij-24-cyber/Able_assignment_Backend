package com.example.able_contact_sync.service;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 29-04-2022
 */

import com.example.able_contact_sync.controller.Contact;
import com.example.able_contact_sync.model.ContactDetail;
import com.example.able_contact_sync.model.InputModel;
import com.example.able_contact_sync.model.ResponseModel;
import com.example.able_contact_sync.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public ResponseModel saveContact(InputModel inputModel) {
        try {
            contactRepository.saveAll(inputModel.getContactDetails());
            return new ResponseModel("Contact Inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseModel("Not inserted");

    }

    public InputModel getAllContact() {
        ArrayList<ContactDetail> res = (ArrayList<ContactDetail>) contactRepository.findAll();
        return new InputModel(res);
    }

    public ResponseModel saveOneContact(ContactDetail contactDetail) {
        try {
            contactRepository.save(contactDetail);
            return new ResponseModel("One contact inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseModel("Not inserted");
    }

    public InputModel getFiveContact() {
        List<ContactDetail> res = contactRepository.findAll();
        ArrayList<ContactDetail> ans = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ans.add(res.get(i));
        }
        return new InputModel(ans);
    }
}
