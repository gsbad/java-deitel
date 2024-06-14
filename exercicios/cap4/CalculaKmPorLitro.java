package exercicios.cap4;

import java.util.Scanner;

public class CalculaKmPorLitro {
    public static void main(String[] args) {
        //declara variaveis
        Scanner input = new Scanner(System.in);
        int qtdViagens = 1;
        int kmTotal = 0;
        int gasolinaTotal = 0;
        int flag = 1;
        
        while (flag != -1) {
            System.out.printf("%nInforme os dados da viagem numero %d: %n", qtdViagens);
            //recebe entradas
            System.out.println("\nInsira quantos km foram percorridos: ");
            int kmDirigidos = input.nextInt();
            System.out.println("\nInsira a quantidade de gasolina consumida: ");
            int gasolinaConsumida = input.nextInt();
            
            double litrosPorKm = (double) kmDirigidos / gasolinaConsumida;
            System.out.printf("O consumo da viagem em Kilometros por litro foi de: %.2fl/km%n", litrosPorKm);

            //incrementa variaveis kmTotal e gasolinaTotal
            kmTotal += kmDirigidos;
            gasolinaTotal += gasolinaConsumida;

            System.out.println("Relatório das viagens: ");
            System.out.printf("Km total de todas as viagens até o momento: %d%n", kmTotal);
            System.out.printf("Gasolina total consumida em todas as viagens até o momento: %d%n%n", gasolinaTotal);

            System.out.println("Digite 1 para continuar registrando novas viagens OU -1 para sair do aplicativo!");
            flag = input.nextInt();
        }
        double litrosPorKm = (double) kmTotal / gasolinaTotal;
        System.out.printf("O consumo TOTAL da todas as viagens em Kilometros por litro foi de: %.2fl/km!%nObrigado por utilizar o app! FIM!", litrosPorKm);
        
        //encerra o recurso input
        input.close();
    }
}
