package com.example.wsdl.consumewsdl.controller;

import com.example.wsdl.consumewsdl.client.CourseClient;
import com.example.wsdl.consumewsdl.generate.GetCourseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    CourseClient client;

    @GetMapping("/test")
    public ResponseEntity<String> test() {

        GetCourseResponse ret = client.getCourse("TEST COURSE");
        System.out.println("RESPONSE: " + ret);
        System.out.println("RESPONSE NAME: " + ret.getCourseName());
        System.out.println("RESPONSE DES: " + ret.getDescription());
        System.out.println("RESPONSE DATE: " + ret.getCreated());
        System.out.println("RESPONSE ID: " + ret.getId());

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
