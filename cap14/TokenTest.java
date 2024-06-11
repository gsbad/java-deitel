package cap14;

import java.util.Scanner;

public class TokenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String sentence = scanner.nextLine();

        //array String q vai receber o array gerado pelo metodo split()
        String[] tokens = sentence.split(" ");

        System.out.printf("Number of elements: %d%nThe tokens are: %n", tokens.length);

        for (String string : tokens) {
            System.out.printf("%s%n", string);
        }
    }
}
