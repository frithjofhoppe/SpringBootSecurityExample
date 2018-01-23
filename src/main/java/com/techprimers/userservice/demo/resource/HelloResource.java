package com.techprimers.userservice.demo.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @RequestMapping(value="/all")
    public String hello(){
        return "hello Youtube";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping(value = "/secured/all")
    public String securedHello(){
        return "SEcured HElllo";
    }
}
