package com.finux.demo.controller;

import com.finux.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {

    @GetMapping("get")
    public Person get(){
        Person person = new Person();
        person.setAge(1);
        person.setDesc("1");
        person.setFirstName("1");
        person.setId(1);
        person.setHeight(1d);
        person.setLastName("1");
        person.setWeight(1d);

        return person;
    }
}
