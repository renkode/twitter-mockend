package com.example.bitter.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bitter.service.ValidateService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/validate")
public class ValidateController {
    private final ValidateService validateService;

    @RequestMapping("/tag/exists/{label}")
    public Boolean hashtagExists(@PathVariable String label) {
        return validateService.tagExists(label);
    }

    @RequestMapping("/username/exists/@{username}") 
    public Boolean usernameExists(@PathVariable String username) {
        return validateService.usernameExists(username);
    }

    @RequestMapping("/username/available/@{username}")
    public Boolean usernameAvailable(@PathVariable String username) {
        return validateService.usernameAvailable(username);
    }
}
