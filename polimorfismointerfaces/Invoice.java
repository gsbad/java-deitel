package cap10;

public class Invoice implements Payable{

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    //construtor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {

        //validações
        if(quantity < 0)
            throw new IllegalArgumentException("Quantity must be > 0!");
        if(pricePerItem < 0)
            throw new IllegalArgumentException("pricePerItem must be > 0!"); 

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    @Override
    public double getPaymentAmount() {
        return (getQuantity() * getPricePerItem());
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
            "Invoice", "part number", getPartNumber(), getPartDescription(),
            "quantity", getQuantity(), "price per item", getPricePerItem());
    }  
}
