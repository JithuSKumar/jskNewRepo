package collectionLinkedList;

import java.util.LinkedList;

public class LinkedListGet {

	public static void main(String[] args) 
	{
		LinkedList <String> listObj = new LinkedList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " + listObj);
		
		System.out.println(listObj.get(2));
	}

}
