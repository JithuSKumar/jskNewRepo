package collectionArrayList;

import java.util.ArrayList;

public class ArrayListContains {

	public static void main(String[] args) 
	{
		ArrayList <String> listObj = new ArrayList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " +listObj);
		
		boolean checkElement = listObj.contains("Cat");
		System.out.println("checkElement: " + checkElement);
		
		boolean checkElement2 = listObj.contains("Cake");
		System.out.println("checkElement2: " + checkElement2);
	}

}
