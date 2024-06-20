package exercicios.cap4;
import java.util.Scanner;

public class BinaryToDecimal{ 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um binário(apenas 1 e 0) para converter em decimal: ");
        long binario = input.nextLong();
        System.out.println();
         
        long binarioOriginal = binario;
        long decimalEquivalente = 0;
        long multiplicador = 1;
        boolean flag = false;

        while(binario != 0){
            long digito = binario % 10;
            if(digito == 1 || digito == 0){
                decimalEquivalente += (digito * multiplicador);

                binario /= 10;
                multiplicador *= 2;
            } else {
                System.out.println("O número binário deve conter apenas 1 e 0! Programa encerrado!");
                flag = true;
                break;
            }
        }

        if(!flag)
            System.out.printf("%nO decimal equivalente ao binário %d é o número: %d%n", binarioOriginal, decimalEquivalente);
        input.close();
    }
}