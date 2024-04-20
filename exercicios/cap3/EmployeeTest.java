package exercicios.cap3;

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Gustavo", "Sá", 120000.00);
        Employee emp2 = new Employee("Miguel", "Sá", 80000.00);

        System.out.printf("Employee name: %s %s%nAnnual Salary: %.2f%n%n", emp1.getFName(), emp1.getLName(), emp1.getSalary());
        System.out.printf("Employee name: %s %s%nAnnual Salary: %.2f%n%n", emp2.getFName(), emp2.getLName(), emp2.getSalary());

        System.out.println("10% raise sallary for both");

        emp1.setSalary(emp1.getSalary() * 1.10);
        emp2.setSalary(emp2.getSalary() * 1.10);

        System.out.printf("Employee name: %s %s%nAnnual Salary: %.2f%n%n", emp1.getFName(), emp1.getLName(), emp1.getSalary());
        System.out.printf("Employee name: %s %s%nAnnual Salary: %.2f%n%n", emp2.getFName(), emp2.getLName(), emp2.getSalary());

    }
}
