package aggregation;

import java.util.Scanner;

public class AddressDetails 
{
	String street;
    String city;
    String state;
    String pinCode;
    StudenDetails studenDetails;
    
    public AddressDetails(String street, String city, String state, String pinCode, StudenDetails studenDetails)
    {
    	 this.street = street;
         this.city = city;
         this.state = state;
         this.pinCode = pinCode;
         this.studenDetails =studenDetails;
    }

    
    public void getFullAddress() 
    {
    	studenDetails.getStudentDetails();
        System.out.println("Address: " + street + ", " + city + ", " + state + " - " + pinCode);
        
    }


	public static void main(String[] args)
	{
		StudenDetails student = new StudenDetails("Jithu S Kumar", 8304340);
        AddressDetails address = new AddressDetails("Ayirooppara","Trivandrum","Kerala","689554",student);
        
        address.getFullAddress();

        
	}

}
