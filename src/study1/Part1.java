package study1;

// superclass abstracts Part1 than implements Interface
public abstract class Part1 implements Interface  {
    
    // more three objects in class Part1
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    
    // Constructor
    public Part1(String firstName, String lastName, String socialSecurityNumber) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber; 
    }
    
    // return firstName
    public String getFirstName() {
        return firstName;
    }
    
    // return lastName
    public String getLastName() {
        return lastName; 
    }
    
    // return socialSecurityNumber
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    @Override // return the Stirng representation of object Part1
    public String toString() {
        return String.format("%s %s%nSocial security number: %s",
            getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
