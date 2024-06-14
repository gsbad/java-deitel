package exercicios.cap4;
import java.util.Scanner;

public class CalculaComissao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salarioBase = 200;
        final float taxaComissao = 0.09f;
        
        double totalComissao;
        double totalVendas;

        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        
        System.out.println("Olá vendedor! Insira a quantidade vendida de cada item:");

        System.out.print("Item 1: ");
        int qtItem1 = input.nextInt();
        System.out.println();

        System.out.print("Item 2: ");
        int qtItem2 = input.nextInt();
        System.out.println();

        System.out.print("Item 3: ");
        int qtItem3 = input.nextInt();
        System.out.println();

        System.out.print("Item 4: ");
        int qtItem4 = input.nextInt();
        System.out.println();

        totalVendas = (item1 * qtItem1) + (item2 * qtItem2) + (item3 * qtItem3) + (item4 * qtItem4);
        totalComissao = totalVendas * taxaComissao;
        double salarioFinal = salarioBase + totalComissao;

        System.out.println("Relatório mensal ==========================================");
        System.out.printf("%-20s%-10s%-10s%-10s%n", "Item", "Preço", "qtd", "Total");
        System.out.printf("%-20s%-10.2f%-10d%-10.2f%n", "Item 1", item1, qtItem1, item1 * qtItem1);
        System.out.printf("%-20s%-10.2f%-10d%-10.2f%n", "Item 2", item2, qtItem2, item2 * qtItem2);
        System.out.printf("%-20s%-10.2f%-10d%-10.2f%n", "Item 3", item3, qtItem3, item3 * qtItem3);
        System.out.printf("%-20s%-10.2f%-10d%-10.2f%n", "Item 4", item4, qtItem4, item4 * qtItem4);
        System.out.println();
        System.out.printf("%-20s%10.2f%n", "Salário-base:", salarioBase);
        System.out.printf("%-20s%10.2f%n", "Total de Vendas:", totalVendas);
        System.out.printf("%-20s%10.2f%n", "Total de Comissão:", totalComissao);
        System.out.printf("%-20s%10.2f%n", "Salário Final:", salarioFinal);

        input.close();
    }
}
