package exercicios.cap4;

public class Tabela {
    public static void main(String[] args) {
        System.out.println("\n\nN 10*N 100*N 1000*N");
        for(int cont = 1; cont <= 5; cont++){
            System.out.printf("%-2d%-5d%-6d%-6d%n", cont, (cont*10), (cont*100), (cont*1000));
        }
    }
}
