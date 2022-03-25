package com.example.demo.controllers;

import com.example.demo.objects.ProObjeto;
import com.example.demo.services.ApiService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@AllArgsConstructor
public class ApiController {

    private ApiService apiService;

    @PostMapping(path = "cadastro")
    @Async
    public CompletableFuture<ProObjeto> registrationPage2(@RequestParam(name = "nickname") String nickname,
                                                          @RequestParam(name = "id") String id,
                                                          @RequestParam(name = "tecnologia1", required = false) String tecnologia1,
                                                          @RequestParam(name = "tecnologia2", required = false) String tecnologia2,
                                                          @RequestParam(name = "tecnologia3", required = false) String tecnologia3,
                                                          @RequestParam(name = "tecnologia4", required = false) String tecnologia4,
                                                          @RequestParam(name = "tecnologia5", required = false) String tecnologia5,
                                                          @RequestParam(name = "tecnologia6", required = false) String tecnologia6,
                                                          @RequestParam(name = "tecnologia7", required = false) String tecnologia7,
                                                          @RequestParam(name = "devweb") String devweb,
                                                          @RequestParam(name = "experiencia") String experiencia,
                                                          @RequestParam(name = "senioridade") String senioridade) {

        if ((tecnologia1 == null || tecnologia1.isBlank()) &&
                (tecnologia2 == null || tecnologia2.isBlank()) &&
                (tecnologia3 == null || tecnologia3.isBlank()) &&
                (tecnologia4 == null || tecnologia4.isBlank()) &&
                (tecnologia5 == null || tecnologia5.isBlank()) &&
                (tecnologia6 == null || tecnologia6.isBlank()) &&
                (tecnologia7 == null || tecnologia7.isBlank()))
            throw new IllegalStateException("Você precisa selecionar uma tecnologia");

        return CompletableFuture.completedFuture(apiService.criarRegistro(nickname,
                id,
                tecnologia1,
                tecnologia2,
                tecnologia3,
                tecnologia4,
                tecnologia5,
                tecnologia6,
                tecnologia7,
                devweb,
                experiencia,
                senioridade));
    }
}
