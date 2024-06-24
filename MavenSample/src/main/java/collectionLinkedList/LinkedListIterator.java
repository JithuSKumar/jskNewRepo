package collectionLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {

	public static void main(String[] args) 
	{
		LinkedList <String> listObj = new LinkedList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " + listObj);
		
		Iterator<String> refVariableIterator = listObj.iterator();
		while(refVariableIterator.hasNext())
		{
			System.out.println("Value located: "+ refVariableIterator.next());
		}
		
		refVariableIterator.remove();
		System.out.println("Array after removing: "+listObj);
	}

}
