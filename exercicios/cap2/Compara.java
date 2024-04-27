
import java.util.Scanner;

public class Compara{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("App Comparação");
        System.out.print("Insira um número inteiro: ");
        numero1 = input.nextInt();

        System.out.print("Insira outro número inteiro: ");
        numero2 = input.nextInt();

        if(numero1 > numero2){
            System.out.printf("%d é maior!%n", numero1);
        }
        if(numero1 < numero2){
            System.out.printf("%d é maior!%n", numero2);
        }
        if(numero1 == numero2){
            System.out.print("Esses numeros sao iguais!\n");
        }

    }
}