package stringscharregex;

import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Please enter address: ");
        String address = scanner.nextLine();
        System.out.println("Please enter city: ");
        String city = scanner.nextLine();
        System.out.println("Please enter state: ");
        String state = scanner.nextLine();
        System.out.println("Please enter zip: ");
        String zip = scanner.nextLine();
        System.out.println("Please enter phone: ");
        String phone = scanner.nextLine();

        System.out.printf("%nValidate result:%n");

        if(!Validate.validateFirstName(firstName))
            System.out.println("Invalid first name!");
        else if(!Validate.validateLastName(lastName))
            System.out.println("Invalid last name!");
        else if(!Validate.validateAddress(address))
            System.out.println("Invalid Address!");
        else if(!Validate.validateCity(city))
            System.out.println("Invalid city!");
        else if(!Validate.validateState(state))
            System.out.println("Invalid state!");
        else if(!Validate.validateCEP(zip))
            System.out.println("Invalid CEP code!");
        else if(!Validate.validatePhoneNumber(phone))
            System.out.println("Invalid phone!");
        else
            System.out.println("Valid input! Thank you!");

        
        scanner.close();
    }
}
