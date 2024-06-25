package polimorfismointerfaces;

public class ComissionEmployee extends Employee{

    //váriavel de instância espécifica da subclasse
    private double grossSales; //vendas brutas semanais
    private double comissionRate; //porcentagem de comissao

    //construtor
    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
    double comissionRate){
        super(firstName, lastName, socialSecurityNumber);

        //Validaçoes
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        if(comissionRate <= 0.0 || comissionRate >= 1)
            throw new IllegalArgumentException("Comission rate must be >= 0.0 and <= 1");    

        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }
    public double getGrossSales() {
        return grossSales;
    }
    
    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");    
        this.grossSales = grossSales;
    }
    public double getComissionRate() {
        return comissionRate;
    }
    public void setComissionRate(double comissionRate) {
        if(comissionRate <= 0.0 || comissionRate >= 1)
            throw new IllegalArgumentException("Comission rate must be >= 0.0 and <= 1"); 
        this.comissionRate = comissionRate;
    }
    @Override
    public double getPaymentAmount() {
        return (getComissionRate() * getGrossSales());
    }
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
            "comission employee", super.toString(),
            "gross sales", getGrossSales(),
            "comission rate", getComissionRate());
    }

    
}
