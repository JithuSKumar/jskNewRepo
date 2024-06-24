package collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) 
	{
		ArrayList <String> listObj = new ArrayList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " +listObj);
		
		Iterator<String> refVariableIterator = listObj.iterator();
		while(refVariableIterator.hasNext())
		{
			System.out.println("Value located: "+ refVariableIterator.next());
		}
		
		refVariableIterator.remove();
		System.out.println("Array after removing: "+listObj);
	}

}
