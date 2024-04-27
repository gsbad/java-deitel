
import java.util.Scanner;

public class Multiplo{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Digite primeiro numero: ");
        num1 = input.nextInt();
        System.out.print("Digite segundo numero: ");
        num2 = input.nextInt();

        if((num1 % num2) == 0)
            System.out.printf("O primeiro numero digitado %d é multiplo de %d!%n", num1, num2);
            else    
            System.out.printf("O primeiro numero digitado %d não é multiplo de %d!%n", num1, num2);
        if((num2 % num1) == 0)
            System.out.printf("O segundo numero digitado %d é multiplo de %d!%n", num2, num1);
    }
}