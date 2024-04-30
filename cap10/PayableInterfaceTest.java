package cap10;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        //cria array Payable de 7 elementos
        Payable[] payableObjects = new Payable[7];

        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("43210", "tire", 5, 175.00);
        payableObjects[2] = new SalariedEmployee("Gustavo", "Sá", "111-111", 1500.00);
        payableObjects[3] = new SalariedEmployee("Miguel", "Sá", "222-222", 500.00);
        payableObjects[4] = new HourlyEmployee("Glauco", "Máximo", "333-333", 25.00, 50.00);
        payableObjects[5] = new ComissionEmployee("Marllons", "Garcia", "444-444", 10000, .2);
        payableObjects[6] = new BasePlusComissionEmployee("Dayana", "Figueiredo", "555-555", 5000, .15, 1000.00);

        System.out.println("\nInvoices and Employeses processed polymorphically:\n");

        for (Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %n%s: $%,.2f%n",
                currentPayable.toString(), //poderia invocar toString implicitamente
                "payment due", currentPayable.getPaymentAmount());
        }
    }
}
