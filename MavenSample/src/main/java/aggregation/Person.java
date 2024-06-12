package aggregation;

public class Person {

	 String name;
	    int age;
	    Address address;  // ref variable of prev class

	    // Constructor
	    Person(String name, int age, Address address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    // Method to display person details
	    void displayPerson()
	    {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.print("Address: ");
	        address.displayAddress();  // Using the Address object
	    }
	        
	        public static void main(String[] args) {
	            // Creating an Address object
	            Address objAddress = new Address("tkm","pdm","pta",454543,"abc");

	            // Creating a Person object with the Address object
	            Person person = new Person("John Doe", 30,objAddress);

	            // Displaying details of the Person, which includes the Address
	            person.displayPerson();
	        

}
}
