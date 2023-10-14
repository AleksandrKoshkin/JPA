package org.example.repository;

import org.example.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByCity(String city);

    List<Person> findByAgeLessThanOrderByAge(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);
}
