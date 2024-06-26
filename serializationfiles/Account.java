package serializationfiles;

import java.io.Serializable;;

public class Account implements Serializable{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    //construtor c valores padroes
    public Account(){
        this(0, "", "", 0.0); //chama o construtor d baixo
    }
    // Inicializa uma account com os valores fornecidos
    public Account(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }   
}
