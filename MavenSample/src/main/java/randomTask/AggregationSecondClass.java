package randomTask;

import java.util.jar.Attributes.Name;



public class AggregationSecondClass //extends AggregationFirstClass 
{


	private AggregationFirstClass firstClass;

	// Constructor to initialize AggregationSecondClass with AggregationFirstClass
	public AggregationSecondClass(AggregationFirstClass firstClass) {
		this.firstClass = firstClass;
	}

	// Method to print the name of the person
	public void printName() {
		System.out.println("Name: " + firstClass.getFullName());
	}

	public static void main(String[] args) {
		// Creating a AggregationFirstClass object
		AggregationFirstClass myName = new AggregationFirstClass("John", "Doe");

		// Creating a AggregationSecondClass object and passing the AggregationFirstClass object
		AggregationSecondClass person = new AggregationSecondClass(myName);

		// Printing the name of the person
		person.printName();
	}
}
