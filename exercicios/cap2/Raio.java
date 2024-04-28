
import java.util.Scanner;

public class Raio{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double pi = Math.PI;
        float raio;

        System.out.print("Digite o valor do raio de um círculo: ");
        raio = input.nextFloat();

        System.out.println("---- Análise geométrica ----");
        System.out.printf("Diâmetro: %.2f%n", (2 * raio));
        System.out.printf("Circunferencia: %.2f%n", (2 * pi * raio));
        System.out.printf("Área: %.2f%n", (pi * raio * raio));        
        // Fechando o scanner após terminar de usá-lo
        input.close();

    }
}