package com.example.wsdl.createwsdl.service;

import com.example.wsdl.createwsdl.controller.ws.dto.GetCourseResponse;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CourseService {

    public GetCourseResponse generate() {
        return new GetCourseResponse();
    }
}
