package com.example.wsdl.createwsdl.controller.ws.dto;

import com.example.wsdl.createwsdl.controller.ws.WSEndPoint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = WSEndPoint.NAMESPACE_URI)
@XmlType(name = "getCourseResponse", propOrder = {
        "id",
        "courseName",
        "description",
        "created"
}, namespace = WSEndPoint.NAMESPACE_URI)
public class GetCourseResponse {

    @XmlElement(required = true)
    protected Long id;

    @XmlElement(required = true)
    protected String courseName;

    @XmlElement(required = true)
    protected String description;

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date created;

}
