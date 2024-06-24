package collectionArrayList;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) 
	{
		ArrayList <String> listObj = new ArrayList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " +listObj);
		
		listObj.remove(3);
		System.out.println("Array after removing 3rd index " +listObj);
		
		listObj.remove("Cat");
		System.out.println("Array afterremoving Cat value: "+ listObj);
	}

}
