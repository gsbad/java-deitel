package polimorfismointerfaces;

public class SalariedEmployee extends Employee{

    //váriavel de instância espécifica da subclasse
    private double weeklySalary;

    //Construtor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        
        //validações
        if(weeklySalary < 0.0) 
            throw new IllegalArgumentException("Weekly salary must be >= 0!");
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s%n%s: $%,.2f",
                    super.toString() , "weekly salary" , getWeeklySalary());
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    public void setWeeklysalary(double weeklySalary){
        //validações
        if(weeklySalary < 0.0) 
            throw new IllegalArgumentException("Weekly salary must be >= 0!");
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    
}
