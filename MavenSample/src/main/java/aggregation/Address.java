package aggregation;

public class Address 
{
	
	String street;
    String city;
    String state;
    int pinCode;

    String checkString;//for my purpose
    
    // Constructor
   public Address(String street, String city, String state, int pinCode, String checkString) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.checkString= checkString;//my purpose
    }

    // Instance Method to display address details
   public void displayAddress()
    {
        System.out.println(street + ", " + city + ", " + state + ", " + pinCode);
        System.out.println("\n \n Checking String: " + checkString);
    }

}
