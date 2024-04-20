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
