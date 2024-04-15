package exercicios.cap2;
import java.util.Scanner;

public class Aritmetica{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;

        int soma;
        int media;
        int produto;

        System.out.println("App Aritmetica");
        System.out.print("Insira primeiro número inteiro: ");
        numero1 = input.nextInt();

        System.out.print("Insira segundo número inteiro: ");
        numero2 = input.nextInt();

        System.out.print("Insira terceiro número inteiro: ");
        numero3 = input.nextInt();        

        soma = numero1 + numero2 + numero3;
        produto = numero1 * numero2 * numero3;
        media = (numero1 + numero2 + numero3) / 3;

        System.out.printf("A soma dos tres inteiros é %d%nO produto dos tres inteiros é %d%nA media dos tres inteiros é %d%n", soma, produto, media);

        if(numero1 < numero2 && numero1 < numero3)
            System.out.printf("%d é o menor%n", numero1);
        if(numero1 > numero2 && numero1 > numero3)
            System.out.printf("%d é o maior%n", numero1);    

        if(numero2 < numero1 && numero2 < numero3)
            System.out.printf("%d é o menor%n", numero2);
        if(numero2 > numero1 && numero2 > numero3)
            System.out.printf("%d é o maior%n", numero2);
            
        if(numero3 < numero2 && numero3 < numero1)
            System.out.printf("%d é o menor%n", numero3);
        if(numero3 > numero2 && numero3 > numero1)
            System.out.printf("%d é o maior%n", numero3);            
        
        System.out.printf("*%n**%n***%n****%n*****%n");
            

    }
}