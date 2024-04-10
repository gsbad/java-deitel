import java.util.Scanner;


public class AccountTest
{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in); 
        Account myAccount = new Account();

        System.out.printf("%s%n", myAccount.getName());

        System.out.print("Por favor insira seu nome: ");
        String theName = input.nextLine();

        myAccount.setName(theName);

        System.out.println();
        System.out.printf("Nome no objeto myAccount é: %n%s%n", myAccount.getName());

    }
}
