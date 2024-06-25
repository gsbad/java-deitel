package polimorfismointerfaces;

public class HourlyEmployee extends Employee{

    //váriavel de instância espécifica da subclasse
    private double wage; //salário por hora
    private double hours; //horas trabalhadas por semana

    //Construtor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);

        //validações
        if(wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0!");
        if((hours < 0.0) || (hours >= 168.0)) 
            throw new IllegalArgumentException("Hours worked per week must be >= 0.0 and <= 168.0");

        this.wage = wage;
        this.hours = hours;
    }
    
    @Override
    public double getPaymentAmount() {
        if(getHours() <= 40) //nenhuma hora extra
            return (getWage() * getHours());
        else
            return (40 * getWage())  + ((getHours() - 40) * getWage() * 1.5);
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%n%s: $%,.2f; %s: %,.2f",
                    super.toString() , "hourly wage" , getWage(), "hours worked", getHours());
    }

    public void setWage(double wage) {
        if(wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0!");    
        this.wage = wage;
    }

    public void setHours(double hours) {
        if((hours < 0.0) || (hours >= 168.0)) 
            throw new IllegalArgumentException("Hours worked per week must be >= 0.0 and <= 168.0");    
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }
    
}
