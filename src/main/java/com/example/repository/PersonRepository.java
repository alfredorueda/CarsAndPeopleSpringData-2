package com.example.repository;

import com.example.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    // Person findById(Long id);

    List<Person> findByName(String name);

    List<Person> findByNameAndSurname(String name, String surname);

    List<Person> findByNameOrSurname(String name, String surname);

    List<Person> findByAgeGreaterThanEqual(Integer age);

    List<Person> findByBirthdayAfter(LocalDate localDate);


}
