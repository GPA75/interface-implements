package study1;


public abstract class Part3 extends Part2 { 
    
    private double grossSale;
    private double commissionRate;
    
    // Constructor
    public Part3(String firstName, String lastName, String socialSecurityNumber,
            double BaseSalary,double grossSale, double commissionRate) {
        
        super(firstName, lastName, socialSecurityNumber, BaseSalary);
        
        if(grossSale < 0) // valid the Gross sale
            throw new IllegalArgumentException(
            "grossSale must by >= 0");
        
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException // valid the Commission rate
            ("Commission rate must by > 0 and < 1");
        
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }
    
    // set the GrossSale
    public void setGrossSale(double grossSale) {
        if(grossSale < 0)
            throw new IllegalArgumentException
            ("grossSale must by >= 0");
        
        this.grossSale = grossSale;
    }
    
    // return GrossSale
    public double getGrossSale() {
        return grossSale;
    }
    
    // set the CommissionRate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0 || commissionRate >= 1)
            throw new IllegalArgumentException(
            "Commission rate must by > 0 and < 1");
        
         this.commissionRate = commissionRate;
    }    
    
    // return CommissionRate
    public double getCommissionRate() {
        return commissionRate;
    }
    
    /* return object getPaymentAmount() of class Part2 and sum 
       the objects of class Part3(2 objects multiplying)  */    
    public double getPaymentAmount() {
        return super.getPaymentAmount() + (getGrossSale() * getCommissionRate());
    }
    
    @Override // return the representation String of Object Part3
    public String toString() {
        return String.format("%s%n%s: $%,.2f%n%s: %,.2f", super.toString(),
           "Gross sale", getGrossSale(), "Commission rate", 
            getCommissionRate());
    }
}
