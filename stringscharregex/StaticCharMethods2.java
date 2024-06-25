package cap14;

import java.util.Scanner;

public class StaticCharMethods2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a radix ");
        int radix = scanner.nextInt();

        //obtem escolha do usuario
        String arg1 = "Convert digit to character";
        String arg2 = "Convert character to digit";
        System.out.printf("Please choose one:%n1 -- %s%n2 -- %s%n", arg1, arg2);
        int choice = scanner.nextInt();

        //processa solicitaçao
        switch (choice) {
            case 1:
                System.out.println("Enter a digit: ");
                int digit = scanner.nextInt();
                System.out.printf("Convert digit to character: %s%n", Character.forDigit(digit, radix));
                break;
            case 2:
                System.out.println("Enter a character: ");
                char character = scanner.next().charAt(0);
                System.out.printf("Convert digit to character: %s%n", Character.digit(character, radix));
                break;    
        
        }

        scanner.close();
    }
}
