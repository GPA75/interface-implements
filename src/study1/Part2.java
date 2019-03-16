package study1;

public class Part2 extends Part1 {
    
    private double BaseSalary;
    
    // Constructor
    public Part2(String firstName, String lastName, String socialSecurityNumber,
            double BaseSalary) {
        
        super(firstName, lastName, socialSecurityNumber);
        
        if (BaseSalary < 0.0) // valid the BaseSalary
            throw new IllegalArgumentException(
            " Weekly Salary must by >= 0");
        
        this.BaseSalary = BaseSalary;
    }
    
    // set the BaseSalary
    public void setBaseSalary(double BaseSalary) {
        if ( BaseSalary < 0.0)
            throw new IllegalArgumentException(
            " Weekly Salary must by >= 0");
        
        this.BaseSalary = BaseSalary;
    }       
    
    // return BaseSalary
    public double getBaseSalary() {
        return BaseSalary;
    }
    
    // return of the object getPaymentAmount for getBaseSalary()
    public double getPaymentAmount() {
        return getBaseSalary();
    }
    
    @Override // return the representation String of Object Part2 
    public String toString() {
        return String.format(
            "Salaried employee: %s%n%s: $%,.2f", 
            super.toString(), "Base salary", getBaseSalary());
    }
}    
        
    

