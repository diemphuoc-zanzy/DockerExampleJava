package com.example.DockerExample.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthDto {
    private String hash;
    private String token;
    private Boolean isExternal;
}
