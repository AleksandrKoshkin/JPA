package org.example.service;

import org.example.person.Person;
import org.example.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Person> getPersonsByAgeLessThanOrderBy(int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public Long count() {
        return repository.count();
    }
}
