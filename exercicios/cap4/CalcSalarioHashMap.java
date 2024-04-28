package exercicios.cap4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CalcSalarioHashMap {
    // Constantes declaradas como static para servirem ao escopo dos metodos da classe como um todo
    final static int horasSemanais = 40;
    final static double rateBonus = 1.50;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\n============ Bem-vindo a calculadora de salários ============\n");

        System.out.print("Informe o número de empregados: ");
        int totalEmpregados = input.nextInt();

        // Lista para armazenar os empregados
        List<Map<String, Object>> empregados = new ArrayList<>();

        // Leitura dos dados dos empregados
        for (int i = 0; i < totalEmpregados; i++) {
            Map<String, Object> empregado = new HashMap<>();

            System.out.printf("Insira o nome do funcionário %d: %n", (i + 1));
            String nome = input.next();
            empregado.put("nome", nome);

            System.out.printf("Insira o salário do funcionário %s: ", nome);
            double salario = input.nextDouble();
            empregado.put("salario", salario);

            System.out.printf("Insira a qtd de horas trabalhadas na semana do funcionário %s: ", nome);
            int horasTrabalhadas = input.nextInt();
            empregado.put("horasTrabalhadas", horasTrabalhadas);

            empregados.add(empregado);
        }

        System.out.println("\n\n============ Obrigado pela entrada de dados! Gerando relatório salarial! ============\n");

        System.out.println("               Salário-bruto  |  Horas-semanais  |  Salário-líquido");

        // Geração dos relatórios
        for (Map<String, Object> empregado : empregados) {
            relatorioEmpregado(empregado);
        }
        // Fechando o scanner após terminar de usá-lo
        input.close();
    }

    public static void relatorioEmpregado(Map<String, Object> empregado) {
        String nome = (String) empregado.get("nome");
        double salario = (double) empregado.get("salario");
        int horasTrabalhadas = (int) empregado.get("horasTrabalhadas");

        double salarioRecebido = salario;
        // Verifica se as horas trabalhadas excederam as horas de trabalho semanais exigidas
        if (horasTrabalhadas > horasSemanais) {
            int horasExtra = horasTrabalhadas - horasSemanais;
            salarioRecebido += (horasExtra * rateBonus);
        }

        String relatorioSalarial = String.format("%-15s%-18.2f%-19d%.2f",
                nome, salario, horasTrabalhadas, salarioRecebido);
        System.out.println(relatorioSalarial);
    }
}
