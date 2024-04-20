import java.util.Scanner;

public class AccountTest
{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in); 

        Account account1 = new Account("Gustavo Sá", 15);
        Account account2 = new Account("Miguel Sá", 15.7);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nadding %.2f to account1 balance%n%n",
        depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account1

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nadding %.2f to account2 balance%n%n",
        depositAmount);
        account2.deposit(depositAmount); // adiciona ao saldo de account2

        displayAccount(account1);
        displayAccount(account2);

        // Saques
        System.out.printf("Gostaria de sacar algum valor %s?%n", account1.getName());
        account1.withdraw(input.nextDouble());
        System.out.printf("Gostaria de sacar algum valor %s?%n", account2.getName());
        account1.withdraw(input.nextDouble());

    }
    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $%.2f %n",
        accountToDisplay.getName(),accountToDisplay.getBalance());
    }
}
