// Fig. 32.1: WelcomeSOAP.java
// Web service that returns a welcome message via SOAP.
package com.deitel.welcomesoap;

import javax.jws.WebService; // program uses the annotation @WebService
import javax.jws.WebMethod; // program uses the annotation @WebMethod
import javax.jws.WebParam; // program uses the annotation @WebParam

@WebService() // annotates the class as a web service
public class WelcomeSOAP
{
   // WebMethod that returns welcome message
   @WebMethod(operationName = "welcome")
   public String welcome(@WebParam(name = "name") String name)
   {
      return "Welcome to JAX-WS web services with SOAP, " + name + "!";
   } 
} 

