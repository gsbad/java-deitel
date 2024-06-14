package exercicios.cap4;
import java.util.Scanner;
public class DesenhaQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nInsira o tamanho dos lados do quadrado (entre 1 e 20): ");
        int lados = input.nextInt();
        System.out.println();
        
        String comprimento = "* ";

        //Valida se usuario inseriu dentro do range de 1 a 2050
        if(lados < 1 || lados > 20){
            System.out.println("Formato inválido!");
        }else{
            for(int i = 1; i <= lados; i++){
                comprimento += "* ";
            }
            comprimento += "* ";
    
            //desenha a linha horizontal no topo do quadrado
            System.out.println(comprimento);
    
            // cria a string das linhas de altura do quadrado e armazena numa string
            String altura = "* ";
            for(int i = 1; i <= (lados * 2); i++){
                altura += " ";
            }
            altura += "*";
    
            // imprime a altura do quadrado
            for(int i = 1; i <= lados; i++){
                System.out.println(altura);
            }
    
            //desenha a linha horizontal na base do quadrado
            System.out.println(comprimento);
        }
        
        input.close();
    }
}
