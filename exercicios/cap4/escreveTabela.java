package exercicios.cap4;

public class escreveTabela {
    public static void main(String[] args) {
        //N 10*N 100*N 1000*N
        int n = 1;
        System.out.printf("%nN%10d*N%10d*N%10d*N%n", (10 * n), (100 * n), (1000 * n));
        while(n <= 5){
            System.out.printf("%d%10d%12d%12d%n", n, (10 * n), (100 * n), (1000 * n));
            n++;
        }
    }
}
