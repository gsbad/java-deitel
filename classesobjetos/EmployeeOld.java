package classesobjetos;
public class EmployeeOld
{
   private String firstName;
   private String lastName;
   private Date birthDate;
   private Date hireDate;

   public EmployeeOld(String firstName, String lastName, Date birthDate, 
      Date hireDate)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthDate = birthDate;
      this.hireDate = hireDate;
   } 

   public String toString()
   {
      return String.format("%s, %s  Hired: %s  Birthday: %s", 
         lastName, firstName, hireDate, birthDate);
   } 
}