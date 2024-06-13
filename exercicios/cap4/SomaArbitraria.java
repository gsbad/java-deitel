package exercicios.cap4;
import java.util.Scanner;

public class SomaArbitraria{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int sum = 0;
        int number = 0;


        System.out.println("Digite um inteiro positivo: ");

        while(flag){
            number = input.nextInt();
            if(number <= 0){
                System.out.println("Número inválido! Digite um inteiro positivo!");
                flag = true;
            }else if(number > 0){
                int cont = 1;
                while(cont <= number){
                    sum += cont;
                    cont++;
                }
                flag = false;
            }
        }

        System.out.printf("%n%nO somatório do inteiro %d é %d%n", number, sum);
        input.close();   
    }   
}