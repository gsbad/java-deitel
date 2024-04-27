import java.util.Scanner;

public class Demo{
	public static void main(String args[]){
	    	String firstName;
		String lastName;
		Scanner input = new Scanner(System.in);	
		
		System.out.printf("Insira o nome e sobrenome!%n");
		
		firstName = input.nextLine();
		lastName = input.nextLine();
		
		displayName(firstName, lastName);
	}
	
	public static void displayName(String firstName, String lastName){
		String mensagem = String.format("Nome: %s%nSobrenome: %s%n", firstName, lastName);
		System.out.println(mensagem);
	}
}


