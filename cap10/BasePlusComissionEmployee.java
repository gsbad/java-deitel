package cap10;

public class BasePlusComissionEmployee extends ComissionEmployee{
    //váriavel de instância espécifica da subclasse
    private double baseSalary; // salário de base por semana

    public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double comissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);

        //Vallidações
        if(baseSalary < 0.0)
                throw new IllegalArgumentException("Base Salary must be >= 0.0!");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0)
                throw new IllegalArgumentException("Base Salary must be >= 0.0!");
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        //sobrescreve earnings de ComissionEmployee c a diferença de que há a soma pelo salário base
        return (getBaseSalary() + super.earnings());
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
            "base-salaried", super.toString(),
            "base salary", getBaseSalary());
    }

    
}
