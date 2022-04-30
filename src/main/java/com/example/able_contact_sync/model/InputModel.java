package com.example.able_contact_sync.model;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 29-04-2022
 */

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class InputModel {
    ArrayList<ContactDetail> contactDetails;

    public InputModel() {
        this.contactDetails = new ArrayList<>();
    }

    public InputModel(ArrayList<ContactDetail> contactDetails) {
        this.contactDetails = contactDetails;
    }
}
