package exercicios.cap4;
import java.util.Scanner;

public class DoisMaiores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.printf("%n%nInsira o inteiro número %d: ", counter);
            number = input.nextInt();
            System.out.println();
            
            if(number > largest){
                secondLargest = largest;
                largest = number;
            } else if(number > secondLargest && number != largest){
                secondLargest = number;
            }
            System.out.printf("O maior número inserido até agora foi o numero = %d%n", largest); 
            System.out.printf("O segundo maior número inserido até agora foi o numero = %d%n", secondLargest);  
            ++counter;
        }
        System.out.printf("%nO maior número inserido foi %d%n", largest);
        System.out.printf("%nO segundo maior número inserido foi %d%n", secondLargest);
        input.close();
    }
}
