package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController // Marks the class its on as a controller where every method returns a domain object instead of a view (It is shorthand for alternative use of @Controller and @ResponseBody)
public class GreetingController {
    private static final String template = "Hello, %s!"; //variable 1
    private final AtomicLong counter = new AtomicLong(); //variable 2

    @GetMapping("/greeting") //Getmapping() ensures that http requests for /greeting are mapped to this method
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){ // RequestParam() binds value of query string parameter "name" into name parameyrt of greeting & optionally default value
        return new Greeting(counter.incrementAndGet(), String.format(template, name)); // Returning a Greeting object with its properties with values
    }// the object data of Greeting will be written directly to the HTTP response as JSON by Spring's HTTP message converter JACKSON
}
