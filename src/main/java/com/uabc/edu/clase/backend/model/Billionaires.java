package com.uabc.edu.clase.backend.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Billionaires {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String career;

    public Billionaires(String firstName, String lastName, String career) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.career = career;
    }

    public Billionaires() {

    }
}
