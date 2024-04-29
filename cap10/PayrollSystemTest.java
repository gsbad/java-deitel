package cap10;

public class PayrollSystemTest {
    public static void main(String[] args) {
        //cria objetos de subclasses
        SalariedEmployee salariedEmployee = 
            new SalariedEmployee("Gustavo", "Sá", "111-111", 800.00);
        HourlyEmployee hourlyEmployee = 
            new HourlyEmployee("Day", "Figueiredo", "222-222", 22.00, 50.00);
        ComissionEmployee comissionEmployee = 
            new ComissionEmployee("Glauco", "Máximo", "333-333", 10000, .06);
        BasePlusComissionEmployee basePlusComissionEmployee =
            new BasePlusComissionEmployee("Marllons", "Garcia", "444-444", 11000, .06, 1200.00);

        System.out.println("Employees processed individualy: ");
        
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
            salariedEmployee, "Earned", salariedEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
            hourlyEmployee, "Earned", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
            comissionEmployee, "Earned", comissionEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
            basePlusComissionEmployee, "Earned", basePlusComissionEmployee.earnings());
            

        //cria um array Employee de 4 elementos
        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;
        employees[3] = basePlusComissionEmployee;

        System.out.println("\n\nEmployees processed polymorphically: \n\n");

        //processa genericamente cada elemento em employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            
            if(currentEmployee instanceof BasePlusComissionEmployee){
                //{downcast} da ref de Employee p ref a BasePlusComissionEmployee
                BasePlusComissionEmployee employee = (BasePlusComissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% incrase is: $%,.2f%n",
                    employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        //obtem o nome do tipo de cada objeto no array employees (getClass e getName)
        for(int j = 0; j < employees.length; j++){
            System.out.printf("Employee %d is a %s%n",
                j, employees[j].getClass().getName());
        }


    }
}
