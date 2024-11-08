package org.example.spirngbootfirstlesson.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.Response;
import org.example.spirngbootfirstlesson.dto.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable("name") String name) {
        return ResponseEntity.ok( "Hello " + name);
    }

    @PostMapping("/goodbye")
    public ResponseEntity<String> goodbye(@RequestBody Person person) {
        return ResponseEntity.ok("Goodbye " + person.getName());
    }

    @GetMapping("/get")
    public ResponseEntity<Person> getPerson() {
        Person person = new Person();
        person.setName("Eslam");
        return ResponseEntity.ok(person);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Person>> getAllPersons() {
        Person person1 = new Person();
        person1.setName("Eslam");
        Person person2 = new Person();
        person1.setName("Ahmed");
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        return ResponseEntity.ok(persons);
    }

    @GetMapping("status-test")
    public void statusTest(HttpServletResponse response) {

        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }
}
