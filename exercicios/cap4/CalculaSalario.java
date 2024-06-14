package exercicios.cap4;
import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cargaBase = 40; //carga-horaria base de 40horas semanais
        int qtdFuncionarios = 3;
        final float txHoraExtra = 1.5f; //50% a mair por cada hora alem das 40horas semanais
        
        for(int funcionario = 1; funcionario <= qtdFuncionarios; funcionario++){
            System.out.println("\nInsira os dados do funcionario numero " + funcionario);
            
            System.out.print("Qual o valor do salário-hora: ");
            int valorHora = input.nextInt();
            System.out.println();

            System.out.print("Quantas hora o funcionario trabalhou na ultima semana: ");
            int horasTrabalhadas = input.nextInt();
            System.out.println();

            int horaExtra = 0;
            double salarioBruto;
            double comissao = 0;
            if(horasTrabalhadas > cargaBase){
                horaExtra = (horasTrabalhadas - cargaBase);
                comissao = ((horaExtra * valorHora) * txHoraExtra);
                salarioBruto = (cargaBase * valorHora) + comissao;
            }else{
                salarioBruto = (horasTrabalhadas * valorHora);
            }

            System.out.printf("%n%n==== Relatório semanal - Funcionário %d ====%nCarga horária semanal base: %d%nSalário-hora: %d%nHoras trabalhadas: %d%n%n", funcionario,
                                                                cargaBase, valorHora, horasTrabalhadas);
            System.out.printf("Horas extras trabalhadas: %d%nValor hora-extra: %.2f%nSalário total recebido: %.2f%n%nFIM!",
                                                    horaExtra, comissao, salarioBruto);
            
        }
        
        input.close();
    }
}
