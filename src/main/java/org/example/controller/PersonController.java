package org.example.controller;

import org.example.person.Person;
import org.example.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    private PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getCity(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }

    @GetMapping("/persons/age-less-than")
    public List<Person> getPersonByAgeLessThanOrderBy(int age) {
        return service.getPersonsByAgeLessThanOrderBy(age);
    }

    @GetMapping("/persons/by-name-and-surname")
    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return service.getPersonByNameAndSurname(name, surname);
    }

    @PostMapping("/persons/save")
    public Person save(Person person) {
        return service.save(person);
    }

    @GetMapping("/persons/count")
    public Long count() {
        return service.count();
    }
}
