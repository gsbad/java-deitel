
import java.util.Scanner;

public class ParImpar{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        if((numero % 2) == 0 && numero != 0)
            System.out.printf("%d é par!%n", numero);
        if((numero % 2) != 0 && numero != 0)
            System.out.printf("%d é ímpar!%n", numero);
        if(numero == 0)
            System.out.println("Digitou zero!");    
    }
}