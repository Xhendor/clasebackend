package com.uabc.edu.clase.backend.controller;


import com.uabc.edu.clase.backend.model.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaludoController {

        private final String template="Holis!!! %s!";
        private final AtomicLong contador=new AtomicLong();

        @GetMapping("/saludo")
        public Saludo saludos(@RequestParam(value = "nombre",defaultValue = "Jaimito") String nombre){

            return new Saludo(contador.incrementAndGet(),String.format(template,nombre));

        }


}
