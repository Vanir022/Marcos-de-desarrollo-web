
package com.example.Actividad6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Actividad6Controller {

    // Endpoint GET simple
    // Ejemplo: http://localhost:8080/api/hola
    @GetMapping("/hola")
    public String hello() {
        return "<h2>Hola, Mundo!</h2><a href='/index.html'>Regresar al inicio</a>";
    }

    // Otro endpoint GET simple
    // Ejemplo: http://localhost:8080/api/adios
    @GetMapping("/adios")
    public String bye() {
        return "<h2>Adiós</h2><a href='/index.html'>Regresar al inicio</a>";
    }

    // Endpoint 3: suma por query params
    // Ejemplo: http://localhost:8080/api/sumar?a=2&b=3
    @GetMapping("/sumar")
    public String sumar(@RequestParam(required = false) Integer a, @RequestParam(required = false) Integer b) {
        if (a == null || b == null) {
            return "<form method='get' action='/api/sumar'>"
                + "<label>Primer número: <input type='number' name='a' required></label><br>"
                + "<label>Segundo número: <input type='number' name='b' required></label><br>"
                + "<button type='submit'>Sumar</button>"
                + "</form>"
                + "<a href='/index.html'>Regresar al inicio</a>";
        }
        return "<h2>La suma es: " + (a + b) + "</h2><a href='/index.html'>Regresar al inicio</a>";
    }

    // Endpoint 4: resta por path variable
    // Ejemplo: http://localhost:8080/api/restar/5/2
    @GetMapping("/restar/{a}/{b}")
    public String restarPath(@PathVariable int a, @PathVariable int b) {
        return "<h2>La resta es: " + (a - b) + "</h2><a href='/index.html'>Regresar al inicio</a>";
    }

    // Endpoint 5
    // Ejemplo: http://localhost:8080/api/fecha
    @GetMapping("/fecha")
    public String fecha() {
        return "<h2>Otro día más</h2><a href='/index.html'>Regresar al inicio</a>";
    }
}