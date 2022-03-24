package com.example.demo.controllers;

import com.example.demo.services.PageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@AllArgsConstructor
public class PageController {

    private PageService pageService;

    @GetMapping
    public CompletableFuture<String> registrationPage() {
        return CompletableFuture.completedFuture(pageService.buildRegistrationPage());
    }

}
