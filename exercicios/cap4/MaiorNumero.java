package exercicios.cap4;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int largest = 0;

        int position = 0; //apenas para registrar tambem o indice

        while (counter <= 10) {
            System.out.printf("%n%nInsira o inteiro número %d: ", counter);
            number = input.nextInt();
            System.out.println();
            

            if(largest < number){
                largest = number;
                position = counter;
            }     
            

            System.out.printf("O maior número inserido até agora foi o %dº numero = %d%n", position, largest);  
            ++counter;
        }
        System.out.printf("%nO maior número inserido foi %d, na posição %d%n", largest, position);
        input.close();
    }
}
