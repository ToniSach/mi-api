package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiControlador {

    @GetMapping("/saludo")
    public String saludo() {
        return "¡Hola desde mi API!";
    }
}
