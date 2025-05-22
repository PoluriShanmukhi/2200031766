package com.klef.jfsd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {

}
