package com.uabc.edu.clase.backend.controller;


import com.uabc.edu.clase.backend.model.Billionaires;
import com.uabc.edu.clase.backend.model.Saludo;
import com.uabc.edu.clase.backend.repository.BillionairesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class SaludoController {

        private final String template="Holis!!! %s!";
        private final AtomicLong contador=new AtomicLong();
        private final String templateV2="Servidor Doce:!!! %s!";
        @Autowired
        BillionairesRepository repo;


        @GetMapping("/billonarios")
        public List<Billionaires> billionaires(@RequestParam(value = "apellido",defaultValue = "Gates") String apellido){

              Iterable<Billionaires> iterable= repo.findAll();
                List<Billionaires> lista=StreamSupport.stream(iterable.spliterator(), false)
                        .collect(Collectors.toList());
                return lista;

        }


        @GetMapping("/billonarios/{id}")
        public Billionaires billionario(@PathVariable("id") long id){
                        Billionaires nop=new Billionaires("No existe","Y van a reprobar","LSC");

                return repo.findById(id).orElse(nop);

        }

        @PutMapping("/billonarios")
        public Billionaires  billionario(@RequestBody Billionaires billo){

                billo.setId(repo.count()+1);
             return   repo.save(billo);

        }

        @GetMapping("/saludo")
        public Saludo saludos(@RequestParam(value = "nombre",defaultValue = "Jaimito") String nombre){

            return new Saludo(contador.incrementAndGet(),String.format(template,nombre));

        }


        @PostMapping("/saludoSave")
        public String saludo(@RequestBody Saludo saludo){

              return  String.format(template,saludo.getContenido());
        }


        @PutMapping("/saludoPut")
        public String saludoPut(@RequestBody Saludo saludo){

                return  String.format(template,saludo.getContenido());
        }

        @DeleteMapping("/saludoDelete/{id}")
        public String saludoDelete(@PathVariable("id")Long id){

                return "Estas borrando el "+id;
        }
}
