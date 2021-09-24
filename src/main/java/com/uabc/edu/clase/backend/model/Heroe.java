package com.uabc.edu.clase.backend.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "heroes")
public class Heroe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;


    public Heroe(String name) {
        this.name = name;
    }

    public Heroe() {

    }
}
