package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Person;

public interface PersonService {

    public List<Person> displayPersons();

    public String addPerson(Person person);

}
