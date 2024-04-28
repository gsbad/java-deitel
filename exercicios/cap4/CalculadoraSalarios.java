package exercicios.cap4;
import java.util.Scanner ;

public class CalculadoraSalarios {
	// Constantes declaradas como static para servirem ao escopo dos metodos da classe como um todo
	final static int horasSemanais = 40;
	final static double rateBonus = 1.50;

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		int totalEmpregados;
		System.out.println("\n\n============ Bem-vindo a calculadora de salários ============\n");
		
		System.out.print("Informe o número de empregados: ");
		totalEmpregados = input.nextInt();

		//Define o numero de indices do array de2 String listaEmpregados
		String[] listaNomes = new String[totalEmpregados];
		double[] listaSalarios = new double[totalEmpregados];
		int[] listaHorasTrabalhadas = new int[totalEmpregados];
		
		// Consumir o caractere de nova linha pendente
		input.nextLine();

		int cont;
		//Itera e atribui nome dos funcionarios
		for (cont = 0; cont < totalEmpregados; cont++) {
			System.out.printf("Insira o nome do funcionário %d: %n", (cont + 1));
			listaNomes[cont] = input.nextLine();
		}

		//Itera e atribui os salários
		for (cont = 0; cont < totalEmpregados; cont++) {
			System.out.printf("Insira o salário do funcionário %s: ", (listaNomes[cont]));
			listaSalarios[cont] = input.nextDouble();
		}
		//Itera e atribui as horas trabalhadas
		for (cont = 0; cont < totalEmpregados; cont++) {
			System.out.printf("Insira a qtd de horas trabalhadas na semana do funcionário %s: ", (listaNomes[cont]));
			listaHorasTrabalhadas[cont] = input.nextInt();
		}
		
		System.out.println("\n\n============ Obrigado pela entrada de dados! Gerando relatório salarial! ============\n");

		System.out.println("               Salário-bruto  |  Horas-semanais  |  Salário-líquido");

		//Itera e gera os relatórios
		for (cont = 0; cont < totalEmpregados; cont++) {
			relatorioEmpregado(listaNomes[cont], listaSalarios[cont], listaHorasTrabalhadas[cont]);
		}

		// Fechando o scanner após terminar de usá-lo
        input.close();
	}

	public static void relatorioEmpregado(String nome, double salario, int horasTrabalhadas){
		double salarioRecebido = salario;
		// Verifica se as horas trabalhadas excederam as horas de trabalho semanais exigidas
		if(horasTrabalhadas > horasSemanais){
			int horasExtra = horasTrabalhadas - horasSemanais;
			salarioRecebido += (horasExtra * rateBonus);  
		}
		String relatorioSalarial = String.format("%-15s%-18.2f%-19d%.2f",
													nome, salario, horasTrabalhadas, salarioRecebido);
		System.out.println(relatorioSalarial);
	}
}