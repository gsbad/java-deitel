package exercicios.cap3;

public class Employee {

    private String fname;
    private String lname;
    private double salary;

    public Employee(String fname, String lname, double salary){
        this.fname = fname;
        this.lname = lname;
        if(salary > 0)
            this.salary = salary;
    }

    public void setFName(String fname){
        this.fname = fname;
    }
    public String getFName(){
        return this.fname;
    }
    public void setLName(String lname){
        this.lname = lname;
    }
    public String getLName(){
        return this.lname;
    }
    public void setSalary(double salary){
        if(salary > 0)
            this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
}
