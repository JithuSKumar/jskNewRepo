package collectionLinkedList;

import java.util.LinkedList;

public class LinkedListContains {

	public static void main(String[] args)
	{
		LinkedList <String> listObj = new LinkedList<String>();
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
