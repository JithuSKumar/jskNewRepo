package collectionLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkeListIsEmpty {

	public static void main(String[] args) 
	{
		LinkedList <String> listObj = new LinkedList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " + listObj);
		
		
		boolean checking = listObj.isEmpty();
		System.out.println("When array have data: " + checking);
		
		ArrayList <String> listObj2 = new ArrayList<String>();
		
		boolean checking1 = listObj2.isEmpty();
		System.out.println("When array is empty: " + checking1);
	}

}
