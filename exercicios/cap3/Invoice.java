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
