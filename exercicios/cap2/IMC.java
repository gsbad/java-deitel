package exercicios.cap2;
import java.util.Scanner;

public class IMC {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float imc;
        float altura;
        float peso;

        System.out.println("Calculadora de IMC (Indice de massa corporea)");
        System.out.print("Digita sua altura: ");
        altura = input.nextFloat();
        System.out.print("Digita sua peso: ");
        peso = input.nextFloat();

        imc = (peso) / (altura*altura);

        System.out.printf("%nSeu indice de massa corporea (IMC) é: %.2f%n", imc);

        if(imc < 18.5)
            System.out.println("Voce esta abaixo da massa corporea ideal!");
        if(imc > 18.5 && imc < 24.9)
            System.out.println("Voce esta com a massa corporea ideal!");
        if(imc > 25 && imc < 29.9)
            System.out.println("Voce esta com sobrepeso!");
        if(imc > 30)
            System.out.println("Voce esta obeso!");
    }    
}