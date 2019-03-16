package study1;

public class Constructor {
    
    public static void main(String[] args) {
        
        // create array Study elemnts four 
        Interface[] x = new Interface[4];
        
        x[0] = new Invoice("01289", "Laptop", 2, 450);
        x[1] = new Invoice("07848", "cellphone", 1, 199);
        x[2] = new TestDate("John", "William", "987-54-877", 920, 584, .05,
        2,29,1996);
        x[3] = new TestDate("Susan", "Peter", "874-58-874", 2500, 150, .05,
        1,23,1997);
        
        System.out.println("Invoice and Employee processed polymorphically:");
        
        // process generation each element in array x
        for (Interface y : x) {
            
            // generates output y and by payment amount appropriate
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    y.toString(), "Payment due", y.getPaymentAmount());
        }
    }
}