package exercicios.cap4;
import java.util.Scanner;

public class LocalizeMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] number = new int[11]; // Array de vendas
        int maiorVendas = 0; // Inicializa o maior número de vendas como zero
        int indiceMaior = 0; // Inicializa o índice do maior vendedor como zero
    
        System.out.println("Insira o número de vendas dos vendedores para ao final determinarmos o vencedor!");
        for(int cont = 1; cont <= 10; cont++) {
            System.out.printf("Vendas do vendedor %d: ", cont);
            number[cont] = input.nextInt();
            
            // Verifica se o número de vendas do vendedor atual é maior do que o maior número de vendas encontrado até agora
            if (number[cont] > maiorVendas) {
                maiorVendas = number[cont]; // Atualiza o maior número de vendas
                indiceMaior = cont; // Atualiza o índice do maior vendedor
            }
        }
    
        System.out.println();
        System.out.printf("O vendedor campeão é o vendedor %d com %d vendas!\n", indiceMaior, maiorVendas);
        input.close();
    }
    
}
