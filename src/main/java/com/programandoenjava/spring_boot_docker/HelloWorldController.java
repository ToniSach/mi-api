package com.programandoenjava.spring_boot_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/saludo")
    public String saludo() {
        return "¡Hola desde mi API Sánchez Cabrera Justino Antonio!";
    }
}
