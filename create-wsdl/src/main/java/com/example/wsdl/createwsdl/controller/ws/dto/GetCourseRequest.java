package com.example.wsdl.createwsdl.controller.ws.dto;

import com.example.wsdl.createwsdl.controller.ws.WSEndPoint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = WSEndPoint.NAMESPACE_URI)
@XmlType(name = "getCourseRequest", propOrder = {
        "course",
        "profiles"
}, namespace = WSEndPoint.NAMESPACE_URI)
public class GetCourseRequest {

    @XmlElement(required = true)
    protected String course;

    @XmlElement(required = true)
    @XmlSchemaType(name = "getProfileRequest", namespace = WSEndPoint.NAMESPACE_URI)
    protected Set<GetProfileRequest> profiles;
}
