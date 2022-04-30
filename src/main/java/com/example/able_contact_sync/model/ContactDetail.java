package com.example.able_contact_sync.model;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 29-04-2022
 */


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@Entity
public class ContactDetail {
    private long id;
    private String firstName;
    private String lastName;
    private String number;

    public ContactDetail(long id, String firstName, String lastName, String number) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }


    public ContactDetail() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

}
