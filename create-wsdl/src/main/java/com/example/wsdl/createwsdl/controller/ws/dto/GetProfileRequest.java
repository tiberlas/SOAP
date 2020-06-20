package com.example.wsdl.createwsdl.controller.ws.dto;

import com.example.wsdl.createwsdl.controller.ws.WSEndPoint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = WSEndPoint.NAMESPACE_URI)
@XmlType(name = "getProfileRequest", propOrder = {
        "profileName"
}, namespace = WSEndPoint.NAMESPACE_URI)
public class GetProfileRequest {

    @XmlElement(required = true)
    protected String profileName;
}
