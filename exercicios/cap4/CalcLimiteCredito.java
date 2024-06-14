package exercicios.cap4;
import java.util.Scanner;

public class CalcLimiteCredito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numConta;
        int saldoInicial;
        int despesaMensal;
        int creditoMensal;
        int limiteCredito;
        int novoSaldo;

        //coleta de dados
        System.out.println("\nInsira o numero da conta:");
        numConta = input.nextInt();

        System.out.println("Insira o saldo inicial:");
        saldoInicial = input.nextInt();

        System.out.println("Insira a despesa mensal:");
        despesaMensal = input.nextInt();

        System.out.println("Insira o total de credito mensal utilizado:");
        creditoMensal = input.nextInt();
        
        System.out.println("Insira o limite de credito autorizado para a conta:");
        limiteCredito = input.nextInt();

        novoSaldo = (saldoInicial + despesaMensal) - creditoMensal;

        if(novoSaldo > limiteCredito){
            System.out.printf("%nLimite de crédito excedido para a conta %d!%n", numConta);
        }else{
            System.out.printf("%nLimite de crédito não excedido para a conta %d!%n", numConta);
        }
        input.close();
    }
}
