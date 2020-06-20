package com.example.wsdl.consumewsdl.client;

import com.example.wsdl.consumewsdl.generate.GetCourseRequest;
import com.example.wsdl.consumewsdl.generate.GetCourseResponse;
import com.example.wsdl.consumewsdl.generate.GetProfileRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;
import java.util.HashSet;
import java.util.Set;

public class CourseClient extends WebServiceGatewaySupport {

    @Autowired
    private Jaxb2Marshaller marshaller;


    public GetCourseResponse getCourse(String course) {
        GetCourseRequest request = new GetCourseRequest();

        Set<GetProfileRequest> profiles = new HashSet<>();
        GetProfileRequest p = new GetProfileRequest();
        p.setProfileName("name0");
        profiles.add(p);
        GetProfileRequest p1 = new GetProfileRequest();
        p1.setProfileName("name1");
        profiles.add(p1);
        request.setCourse(course);//popunimo obj sto saljemo
        request.getProfiles().addAll(profiles); //DEBILIZAM

        try{

            JAXBElement<GetCourseResponse> jax = (JAXBElement<GetCourseResponse>) getWebServiceTemplate()
                    .marshalSendAndReceive(request);

            GetCourseResponse c = jax.getValue();

            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
