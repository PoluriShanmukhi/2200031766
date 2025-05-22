package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Person;
import com.klef.jfsd.repository.PersonRepository;

@Service
public class PersonServiceImplementation implements PersonService {

    @Autowired
    private PersonRepository repository;

    @Override
    public String addPerson(Person s) {
        repository.save(s);
        return "Person Added Successfully";
    }

    @Override
    public List<Person> displayPersons() {
        return (List<Person>) repository.findAll();
    }

}
