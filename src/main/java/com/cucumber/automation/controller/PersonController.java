package com.cucumber.automation.controller;

import com.cucumber.automation.dto.PersonDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    public List<PersonDto> getPersons() {
        return Collections.singletonList(new PersonDto("John", 20));
    }

    @GetMapping("/{id}")
    public PersonDto getPersons(@PathVariable("id") int id) {
        return new PersonDto("David",30);
    }

    @PostMapping
    public ResponseEntity savePerson(@RequestBody PersonDto personDto) {
        return new ResponseEntity("Data Saved",HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable("id") int id) {
        System.out.println("Data Deleted");
    }

}
