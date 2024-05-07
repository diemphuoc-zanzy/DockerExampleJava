package com.example.DockerExample.controller;

import com.example.DockerExample.dtos.LoginDto;
import com.example.DockerExample.dtos.AuthDto;
import com.example.DockerExample.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/login")
    public AuthDto login (LoginDto dto) {

        return authService.login(dto);
    }

    @GetMapping("/ok")
    public String login () {
        return "This is OK!";
    }
}
