# EXAMPLE OF SOAP AND WSDL IMPLEMENTED IN SPRING, MAVEN AND JAVA_11

## INTRODUCTION
In This example we have two project consumer-wsdl and create-wsdl. In create-wsdl we have defined a WS end-poind. Create-wsdl will generate the WSDL file. In consumer-wsdl we will generate messages(in WSDL terminology or in REST it's called dto) from WSDL. Consumer-wsdl will send an SOAP message to crete-wsdl.

## START UP THE APPLICATIONS

### create-wsdl
In pom.xml are all the dependencies for this example. Dependencies for soap are highlightet with comment tag <!--SOAP--> and <!--XSD-->. I suggest you use intellij IDEA for running thi application becouse other IDEs have a problem with the **schemagen** plugin in <!--XSD-->. To generate WSDL we have to run maven clean and install. Nut first we have to comment all setters in com.example.wsdl.createwsdl.controller.ws.SoapEndPoint. The **schemagen** is a lit buggy, maybe in future it will be more convinean to use. After we have comment setters we can use mvn clean install. We have generated the XSD in target folder. The location and name of XSD is set in pom.xml in lines 87 and 89. Now that we have XSD(it just mapped all classes in dto package to XML) we can generate WSDL. To get WSDL we first have to start the application. Then just type in our favourite browser URL: http://localhost:9091/ws/team18-agent.wsdl. The port is defined in application.properties. The path is defined in com.example.wsdl.createwsdl.config.WebServiceConfig. In WebServiceConfig in line 26 we have defined the path and in line 29 we have defined the name of WSDL.

**HINT** if you use chrome I suggest you install extension Wizdler url: https://chrome.google.com/webstore/detail/wizdler/oebpmncolmhiapingjaagmapififiakb

### consume-wsdl
Now that we have created WSDL we can put it in resources folder in consumer-wsdl. In pom.xml we have set dependencies highliett with tags <!--JAX B--> and <!--GENERATE FROM WSDL:START-->. In line 93 we have set in witch folder the WSDL will be. In line 95 we have defined the WSDL name that we will be useing. You can define multiple WSDL files to be used. In line 92 we have defined the package name that will store all aour generated files from WSDL. If the generated pacgake is full you can delete all the files and generate them later. To delete content in generated package first we need to delete META-INF in the base of our project. When you delete content from generate package you will hawe errors. Just simply comment all lines that are red. Now wen the generate package is empty we can run mvn clear and install and that will generate all nedded classes for SOAP. The problem is that the generated classes are not completted. You hawe to add @XmlRootElement(namespace = "http://uns.ac.rs/xml/team18") before class definition. Add that to all generated classes except ObjectFactory and package-info.

## TEST THE APPLICATIONS
To test SOAP we have to run boath application. The consumer-wsdl runs at port 9090 and the create-wsdl runs at port 9091 so you can run them in the same time. To test you can use Postman or any web browser. Just send a HTTP GET method on url: http://localhost:9090/test/test. In both consoles you shod see that SOAP is send.
