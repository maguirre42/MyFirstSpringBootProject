package com.eoi.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Y además preparate para recibir peticiones https
public class ControladorUsuario {
    @RequestMapping("/")
    String hellow()
    {
        return "Hello World";
    }

    @RequestMapping("/hola")
    String holam()
    {
        return "Hola Mundo";
    }

    @RequestMapping("/mimedicacion")
    String miMedicacion()
    {
        return "tomate las pastillas";
    }
}
