package randomTask;

public class AggregationFirstClass {
	
	
	String firstName;
    String lastName;

    // Constructor to initialize Name object
    public AggregationFirstClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to get full name
    public String getFullName() 
    {
        return firstName + " " + lastName;
    }
}
