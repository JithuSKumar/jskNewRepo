package aggregation;

public class Address 
{
	
	String street;
    String city;
    String state;
    int pinCode;

    String checkString;
    
    // Constructor
   public Address(String street, String city, String state, int pinCode, String checkString) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.checkString= checkString;
    }

    // Instance Method to display address details
   public void displayAddress()
    {
        System.out.println(street + ", " + city + ", " + state + ", " + pinCode);
        System.out.println("\n \n Checking String: " + checkString);
    }

}
