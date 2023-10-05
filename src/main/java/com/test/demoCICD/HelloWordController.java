package com.test.demoCICD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/")
    public String hello(@RequestParam(name = "nom", required = false, defaultValue = "ismail") String nom) {
        return "Salut" + nom + "bienvenue au spring-Boot CI/CD demo ";
    }
}