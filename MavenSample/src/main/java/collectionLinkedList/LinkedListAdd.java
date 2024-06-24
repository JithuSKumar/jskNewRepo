package collectionLinkedList;

import java.util.LinkedList;

public class LinkedListAdd {

	public static void main(String[] args)
	{
		LinkedList <String> listObj = new LinkedList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " +listObj);
		
		listObj.add(5, "Fan");
		System.out.println("New Array: " + listObj);
		
	}

}
