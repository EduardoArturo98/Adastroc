package com.example.demo.controllers;

import com.example.demo.services.PageService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@AllArgsConstructor
public class PageController {

    private PageService pageService;

    @GetMapping @Async
    public CompletableFuture<String> registrationPage() {
        return CompletableFuture.completedFuture(pageService.buildRegistrationPage());
    }

}
