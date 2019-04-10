package com.tavva.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/vaishu")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "Hello Vaishu!";
    }
}
