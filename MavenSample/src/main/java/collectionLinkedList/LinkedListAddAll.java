package collectionLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAddAll {

	public static void main(String[] args) 
	{
		LinkedList <String> listObj = new LinkedList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " +listObj);
		
		ArrayList<String> listObj2 = new ArrayList<String>();
		listObj2.add("Fan");
		listObj2.add("Gate");
		
		listObj.addAll(listObj2);
		System.out.println("New Array: " + listObj);
	}

}
