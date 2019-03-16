package study1;

public class TestDate extends Part3 {
    
    // objects date
    private int month;
    private int day;
    private int year;
    
    // valid the days per month
    private static final int[] daysPerMonth = 
    {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    // Constructor
    public TestDate(String firstName, String lastName, String socialSecurityNumber,
    double weeklySalary, double grossSale, double commissionRate, int month,
    int day, int year) {
        
        super(firstName, lastName, socialSecurityNumber, weeklySalary,
                grossSale, commissionRate);
        
        // Checks if month by in interval
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException
            ("month must by > 0 and <= 12");
        
        // Checks if day by in interval for month 
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException 
        ("day ("+ day +") out-of-range for the specified month and year");
        
        // ckecks in year leap if the month is 2 and the day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && 
                year % 100 != 0)))
            throw new IllegalArgumentException
        ("day ("+ day +") out-of-range for the specified month and year"); 
        
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    // set the Month
    public void setMonth(int month) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException
            ("month must by > 0 and <= 12");
        
        this.month = month;
    }
    
    // return Month
    public int getMonth() {
        return month;
    } 
    
    // set the Day
    public void setDay(int day) {
        
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException 
        ("day ("+ day +") out-of -range for the specified month and year");
        
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && 
                year % 100 != 0)))
            throw new IllegalArgumentException
        ("day ("+ day +") out-of -range for the specified month and year"); 
        
        this.day = day;
    }
    
    // return Day
    public int getDay() {
        return day;
    }
    
    // set the Year
    public void setYear() {
        this.year = year;
    }
    
    // return Year
    public int getYear() {
        return year;
    }
    
    @Override // return the representation String of Object TestDate
    public String toString() {
        return String.format("%s: %02d/%02d/%02d%n%s",
         "Birth date", getMonth(), getDay(), getYear(), super.toString());
    }
}