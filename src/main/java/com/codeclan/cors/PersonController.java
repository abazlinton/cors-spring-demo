package com.codeclan.cors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/persons")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    // -> /persons/custom
    @GetMapping(value = "/custom")
    public Person blah(){
        return personRepository.save(new Person("Alex"));
    }

}
