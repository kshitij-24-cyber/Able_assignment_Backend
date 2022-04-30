package com.example.able_contact_sync.model;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 29-04-2022
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseModel {
    private String message;

    public ResponseModel(String message) {
        this.message = message;
    }
}
