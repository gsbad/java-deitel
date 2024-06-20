package exercicios.cap4;
import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {

        System.out.println("Insira um inteiro de 5 dígitos: ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        System.out.println();
        int numeroInvertido = 0;

        //Como "numero" irá ser modificado até virar 10, salva um backup do original em "numeroOriginal"
        int numeroOriginal = numero;

        while(numero != 0){
            //"numero" ciclando
            //96469
            //9646
            //964 
            //96
            //9
            //0 (A ultima, 9/0 = 0 -> Sai do while)

            int digito = numero % 10; //"digito" ciclando: /9  //6 //4 //6 //9

            numeroInvertido = numeroInvertido * 10 + digito; //9  //90+6 //960+4 //9640+6 //96460+9

            System.out.println(numero);
            System.out.println(digito);
            System.out.println(numeroInvertido);

            numero /= 10; //na divisao por 10 "numero" vai perdendo o ultimo digito      
            
            System.out.println();
        }

        System.out.printf("%n%s == %s%n", numeroOriginal, numeroInvertido);

        //Verifica se é palindromo
        if(numeroOriginal == numeroInvertido)
            System.out.println("É um palíndromo!");
        else
            System.out.println("Não é um palíndromo!");
        input.close();
    }
}
