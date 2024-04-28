package exercicios.cap4;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
* Encontre os dois maiores valores 
* entre os 10 valores inseridos. [Observação: você só pode inserir cada número uma vez
 */
public class DoisNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        int maiorNum1 = Integer.MIN_VALUE; // Inicializa o maior número como o menor valor possível
        int maiorNum2 = Integer.MIN_VALUE; // Inicializa o segundo maior número como o menor valor possível

        System.out.println("Insira 10 números diferentes:");

        while (numeros.size() < 10) {
            int numero = input.nextInt();
            if (!numeros.contains(numero)) {
                numeros.add(numero);
                if (numero > maiorNum1) {
                    maiorNum2 = maiorNum1; // Atualiza o segundo maior número
                    maiorNum1 = numero; // Atualiza o maior número
                } else if (numero > maiorNum2) {
                    maiorNum2 = numero; // Atualiza o segundo maior número
                }
            } else {
                System.out.println("Este número já foi inserido. Insira um número diferente.");
            }
        }

        System.out.printf("Maior numero 1: %d\n", maiorNum1);
        System.out.printf("Maior numero 2: %d\n", maiorNum2);
        input.close();
    }
}
