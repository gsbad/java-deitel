
public class Account{

    private String name;
    private double balance;

    public Account(String name, double balance){
        
        this.name = name;
        
        if(balance >= 0){
            this.balance = balance;
        }
    }

    // método que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) // se depositAmount for válido
        balance = balance + depositAmount; // o adiciona ao saldo
    }
    // método retorna o saldo da conta
    public double getBalance()
    {
        return balance;
    }

    public void setName(String name){
        this.name = name;   
    }

    public String  getName(){
        return name;
    }



}
