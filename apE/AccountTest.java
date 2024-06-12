package apE;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Gustavo Sá", 777.777);

        //exibe o saldo inicial do obj Account
        System.out.printf("Initial account balance: $%.3f%n", account.getBalance());

        double depositAmount = 111.111;

        System.out.printf("%nadding %.3f to account balance%n%n", depositAmount);
        account.deposit(depositAmount);

        //exibe o saldo inicial do obj Account
        System.out.printf("Initial account balance: $%.3f%n", account.getBalance());
    }
}
