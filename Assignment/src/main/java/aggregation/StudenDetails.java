package aggregation;

import java.util.Scanner;

public class StudenDetails {
	
	String name;
    int rollNumber;
    
    public StudenDetails(String name, int rollNumber)
    {
    	this.name= name;
    	this.rollNumber =rollNumber;
    	
    }

    public void getStudentDetails() 
    {
    	System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

}
