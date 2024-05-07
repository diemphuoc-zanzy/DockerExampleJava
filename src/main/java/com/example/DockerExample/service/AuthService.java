package com.example.DockerExample.service;

import com.example.DockerExample.dtos.AuthDto;
import com.example.DockerExample.dtos.LoginDto;

public interface AuthService {

    default AuthDto login(LoginDto login) { return new AuthDto(); }
}
