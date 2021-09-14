package com.uabc.edu.clase.backend.model;


import lombok.Data;

@Data
public class Saludo {

        private final long id;
        private final String contenido;

    public Saludo(long id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }
}
