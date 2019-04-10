package com.tavva.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/chythu")
public class HelloResource1 {

    @GetMapping
    public String hello(){
        return "Hello momo!";
    }
}
