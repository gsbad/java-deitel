package jdbc;

public class Person {

   private int AddressID;
   private String FirstName;
   private String LastName;
   private String Email;
   private String PhoneNumber;

   //construtor c implementação vazia
   public Person(){}

   //construtor c todos os campos, e setando metodos modificadores
   public Person(int addressId, String firstName, String lastName
                  , String email, String phoneNumber){
      setAddressID(addressId);               
      setFirstName(firstName);
      setLastName(lastName);
      setEmail(email);
      setPhoneNumber(phoneNumber);
   }

   public int getAddressID() {
      return AddressID;
   }

   public void setAddressID(int addressID) {
      AddressID = addressID;
   }

   public String getFirstName() {
      return FirstName;
   }

   public void setFirstName(String firstName) {
      FirstName = firstName;
   }

   public String getLastName() {
      return LastName;
   }

   public void setLastName(String lastName) {
      LastName = lastName;
   }

   public String getEmail() {
      return Email;
   }

   public void setEmail(String email) {
      Email = email;
   }

   public String getPhoneNumber() {
      return PhoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      PhoneNumber = phoneNumber;
   }
}