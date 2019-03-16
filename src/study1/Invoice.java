package study1;

// Class Invoice than implements Interface   
public class Invoice implements Interface {
    
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;
    
    // Construtor
    public Invoice(String partNumber, String partDescription, int quantity, 
            double pricePerItem) {
        
        if (quantity < 0) // valid quantity
            throw new IllegalArgumentException("Quantity must by >= 0");
        
        if (pricePerItem < 0.0) // valid pricePerItem
            throw new IllegalArgumentException("Price per item must by >= 0");

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    // return partNumber
    public String getPartNumber() {
        return partNumber;
    }
    
    // return partDescription
    public String getPartDescription() {
        return partDescription;
    }
    
    // set the quantity
    public void setQuantity(int quantity) {
        if (quantity < 0) // valid quantity
            throw new IllegalArgumentException("Quantity must by >= 0");
        
        this.quantity = quantity;
    }
    
    // return quantity
    public int getQuantity() {
        return quantity;
    }
    
    // set the pricePerItem
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0) // valid pricePerItem
            throw new IllegalArgumentException("Price per item must by >= 0");
        
        this.pricePerItem = pricePerItem;
    }
    
    // return pricePerItem
    public double getPricePerItem() {
        return pricePerItem;
    }
    
    @Override // return of String representation of Object Invoice
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
         "Invoice", "Part number", getPartNumber(), getPartDescription(), 
         "Quantity", getQuantity(), "Price per item", getPricePerItem());
    }
    
    // method required for starting the contract with the interface 
    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem(); // calculate cost total
    }    
}