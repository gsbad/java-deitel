
import java.util.Scanner;

public class Calculadora{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;
        int produto;
        int diferenca;
        double divisao;

        System.out.println("App Calculadora");
        System.out.print("Insira um número inteiro: ");
        numero1 = input.nextInt();

        System.out.print("Insira outro número inteiro: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;
        produto = numero1 * numero2;
        diferenca = numero1 - numero2;
        divisao =  numero1 / numero2;

        System.out.printf("A soma dos dois inteiros é %d%nO produto dos dois inteiros é %d%nA diferença dos dois inteiros é %d%nA divisão dos dois inteiros é %.2f%n", soma, produto, diferenca, divisao);
        // Fechando o scanner após terminar de usá-lo
        input.close();
    }
}