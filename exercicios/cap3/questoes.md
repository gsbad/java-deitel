# Questões

### 3.5

A palavra-chave **new** serve para criar um local na memoria (variavel) que faça referencia a um objeto de uma classe.

### 3.6

O construtor padrao é um construtor que existe implicitamente para toda classe criada em java, quanto este construtor não é declarado explicitamente. As variáveis de instancia quando nao sao inicializadas através de um construtor são atribuidos valores padrao. Variaveis do tipo primitivo sao definido o valor padrao 0, do tipo boolean o valor padrao false, e do tipo por referencia é atribuido o valor padrao null.

### 3.7

Variáveis de instância são atributos de uma classe no paradigma de orientação ao objeto.

### 3.8

Por que elas ja sao importadas por padrão em todas as classes no pacote java.lang

### 3.9

A unica forma de utilizar a classe Scanner sem fazer um import seria fazendo sua qualificação completa na declaração do objeto Scanner. Ex:
```java
java.util.Scanner input = new java.util.Scanner(System.in);
```

### 3.10

Uma classe pode fornecer métodos set e get para suas variáveis de instância para garantir um melhor controle sobre o acesso e modificação dessas variáveis, além de promover a encapsulação e a segurança do código.

### 3.11

**Feito**

### 3.12
```java
package exercicios.cap3;

public class Invoice {

    private int id;
    private String description;
    private int quantity;
    private double price;

    public Invoice(int id, String description, int quantity, double price){
        this.id = id;
        this.description = description;
        
        if(quantity < 0) 
            this.quantity = 0;
        if(quantity >= 0)
            this.quantity = quantity;
        
        if(price < 0)
            this.price = 0;
        if(price >= 0)
            this.price = price;
    }

    public double getInvoiceAmount(){
        double invoiceAmount = quantity * price;
        return invoiceAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0) 
            this.quantity = 0;
        if(quantity >= 0)
            this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0)
            this.price = 0;
        if(price >= 0)
            this.price = price;
    }   
}
```
```java
package exercicios.cap3;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invc1 = new Invoice(1, "memórias de notebook", 5, 39.9);
        Invoice invc2 = new Invoice(2, "SSD", 10, 99.9);
        Invoice invc3 = new Invoice(3, "Placa de video", 3, 399.9);


        displayInvoice(invc1);
        displayInvoice(invc2);
        displayInvoice(invc3);
    }

    public static void displayInvoice(Invoice invc){
        System.out.printf("< Invoice number %d >%n%nDescription: %s%nQuantity: %d%nPrice: %.2f%n==============%n%nInvoice Amount: %.2f%n%n%n",
                            invc.getId(), invc.getDescription(), invc.getQuantity(), invc.getPrice(), invc.getInvoiceAmount()
        );
    }
}
```
### 3.13
```java
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

```
```java
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

```
### 3.14
```java
package exercicios.cap3;

public class Date{
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int year){
        this.year = year;
    }
    public void setYear(int day){
        this.day = day;
    }


    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public int getYear(){
        return this.year;
    }

    public void displayDate(){
        String fulldate = String.format(" %d/%d/%d ",
            this.month, this.day, this.year);
        System.out.println(fulldate);
    }
}
```

```java
package exercicios.cap3;
public class DateTest{
    public static void main(String args[]){
        Date date = new Date(04,20,2024);

        date.displayDate();
    }
}
```
### 3.15
**Feito**


## Fazendo a diferença

### 3.16


### 3.17