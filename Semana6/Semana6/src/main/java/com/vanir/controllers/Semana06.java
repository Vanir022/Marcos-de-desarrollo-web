//Crea el controlador



package com.vanir.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;    
@Controller
@RequestMapping("/semana06")
public class Semana06 {
    @GetMapping("/mensaje")
    @ResponseBody
    public String mensaje(){
        return "Hola desde el controlador de la semana 06";
    }
}