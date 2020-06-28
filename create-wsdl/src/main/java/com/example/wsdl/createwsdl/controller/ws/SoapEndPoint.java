package com.example.wsdl.createwsdl.controller.ws;


import com.example.wsdl.createwsdl.controller.ws.dto.GetCourseResponse;
import com.example.wsdl.createwsdl.controller.ws.dto.GetCourseRequest;
import com.example.wsdl.createwsdl.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Date;


@Endpoint
public class SoapEndPoint {

	@Autowired
	private CourseService service;

	 @PayloadRoot(namespace = WSEndPoint.NAMESPACE_URI, localPart = "getCourseRequest")
     @ResponsePayload
	 public GetCourseResponse getCourse(@RequestPayload GetCourseRequest user) {

	 	//business logic
	 	System.out.println("> GOT: " + user.toString());
	 	GetCourseResponse response = service.generate();
	 	response.setCreated(new Date());
		response.setCourseName("XML");
		response.setDescription("SOAP");
	 	response.setId(101l);

	 	return response;
//	 	return null;
	 }
}