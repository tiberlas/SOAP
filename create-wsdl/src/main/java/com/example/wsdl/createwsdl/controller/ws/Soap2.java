package com.example.wsdl.createwsdl.controller.ws;

import com.example.wsdl.createwsdl.controller.ws.dto.GetProfileRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

@Endpoint
public class Soap2 {

    @PayloadRoot(namespace = WSEndPoint.NAMESPACE_URI, localPart = "getProfileRequest")
    public void getCountry(@RequestPayload GetProfileRequest request) {

        System.out.println(request);
    }

}
