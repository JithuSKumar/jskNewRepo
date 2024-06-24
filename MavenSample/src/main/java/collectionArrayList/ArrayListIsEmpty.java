package collectionArrayList;

import java.util.ArrayList;

public class ArrayListIsEmpty {

	public static void main(String[] args) 
	{
		ArrayList <String> listObj = new ArrayList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " +listObj);
		
		boolean checking = listObj.isEmpty();
		System.out.println("When array have data: " + checking);
		
		ArrayList <String> listObj2 = new ArrayList<String>();
		
		boolean checking1 = listObj2.isEmpty();
		System.out.println("When array is empty: " + checking1);
	}

}
