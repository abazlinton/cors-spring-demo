package com.codeclan.cors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/persons")
public class PersonController {


    @GetMapping(value = "/custom")
    public Person blah(){
        return new Person("Alex");
    }

}
