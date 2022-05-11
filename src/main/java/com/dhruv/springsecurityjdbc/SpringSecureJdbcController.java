package com.dhruv.springsecurityjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecureJdbcController {

    @GetMapping("/")
    public String home(){
        return "Hello";
    }

    @GetMapping("/user")
    public String homeUser(){
        return "Hello user";
    }

    @GetMapping("/admin")
    public String homeAdmin(){
        return "Hello admin";
    }

}
