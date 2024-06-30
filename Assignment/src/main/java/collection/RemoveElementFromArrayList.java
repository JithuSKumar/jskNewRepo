package collection;

import java.util.ArrayList;

public class RemoveElementFromArrayList 
{
	public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + colors);
        
        
        colors.remove(3);
		System.out.println("Array after removing 3rd index " +colors);
		
		colors.remove("Purple");
		System.out.println("Array afterremoving Purple value: "+ colors);
        
	}
}
