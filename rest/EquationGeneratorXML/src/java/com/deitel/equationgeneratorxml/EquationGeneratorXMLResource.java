// Fig. 31.24: EquationGeneratorXMLResource.java
// RESTful equation generator that returns XML.
package com.deitel.equationgeneratorxml;

import java.io.StringWriter;
import java.security.SecureRandom;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXB; // utility class for common JAXB operations

@Path("equation")
public class EquationGeneratorXMLResource
{
   private static SecureRandom randomObject = new SecureRandom(); 

   // retrieve an equation formatted as XML
   @GET
   @Path("{operation}/{level}")
   @Produces("application/xml")
   public String getXml(@PathParam("operation") String operation,
      @PathParam("level") int level)
   {
      // compute minimum and maximum values for the numbers
      int minimum = (int) Math.pow(10, level - 1);
      int maximum = (int) Math.pow(10, level);

      // create the numbers on the left-hand side of the equation
      int first = randomObject.nextInt(maximum - minimum) + minimum;
      int second = randomObject.nextInt(maximum - minimum) + minimum;

      // create Equation object and marshal it into XML
      Equation equation = new Equation(first, second, operation);
      StringWriter writer = new StringWriter(); // XML output here
      JAXB.marshal(equation, writer); // write Equation to StringWriter
      return writer.toString(); // return XML string
   }
} 


