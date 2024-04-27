
import java.util.Scanner;

public class Desmembra{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num;
        int dezmilhar;
        int milhar;
        int centena;
        int dezena;
        int unidade;
        
        System.out.println("Insira um inteiro de 5 caracteres: ");
        num = input.nextInt();
        
        unidade = (num % 10);

        num = num / 10;

        dezena = (num % 10);

        num = num / 10;

        centena = (num % 10);

        num = num / 10;

        milhar = (num % 10);

        num = num / 10;

        dezmilhar = (num % 10);

        System.out.printf("%n %d %d %d %d %d %n", dezmilhar , milhar , centena, dezena, unidade);

    }
}