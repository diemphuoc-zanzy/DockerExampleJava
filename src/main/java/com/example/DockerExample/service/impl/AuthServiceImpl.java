package com.example.DockerExample.service.impl;

import com.example.DockerExample.dtos.AuthDto;
import com.example.DockerExample.dtos.LoginDto;
import com.example.DockerExample.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthDto login(LoginDto login) { return new AuthDto(); }
}
