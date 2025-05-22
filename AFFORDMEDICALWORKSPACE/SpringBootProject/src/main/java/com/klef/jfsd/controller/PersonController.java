package com.klef.jfsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.model.Person;
import com.klef.jfsd.service.PersonService;

@RestController
@RequestMapping("evaluation-service")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping("register")
    public String addPerson(@RequestBody Person person) {
        return service.addPerson(person);
    }

    @GetMapping("auth")
    public List<Person> displayPersons() {
        return service.displayPersons();
    }

}
