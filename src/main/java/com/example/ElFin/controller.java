package com.example.ElFin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {
    @GetMapping("hola")
    private String hola(){
        return "hola muy buenos dias ya pasamos es la prueba aaaaaaa";
    }

}
