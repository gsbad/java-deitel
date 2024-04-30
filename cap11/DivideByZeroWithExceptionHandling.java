package cap11;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroWithExceptionHandling{
    public static void main(String[] args) {
        int numerator;
        int denominator;
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try{
                System.out.println("Esse programa faz uma divisão!");
                System.out.print("\nInsira um numerador: ");

                numerator = input.nextInt();
                
                System.out.print("\nInsira um denominador: ");

                denominator = input.nextInt();

                int result = quotient(numerator, denominator);

                System.out.printf("O resultado é: %d%n", result);

                
                continueLoop = false;
            }
            catch(InputMismatchException inputMismatchException){
                System.err.printf("%nException: %s%n", inputMismatchException);
                input.nextLine();
                System.out.printf("Você precisa inserir inteiros! Tente novamente!%n%n");
            }
            catch(ArithmeticException arithmeticException){
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero é um denominador inválido! Tente novamente!%n%n");
            }
        }while (continueLoop);
        input.close();
    }
    public static int quotient(int numerator, int denominator){
        if (denominator == 0) {
            throw new ArithmeticException("Erro de divisão por zero");
        }
        return (numerator / denominator);
    }
}
