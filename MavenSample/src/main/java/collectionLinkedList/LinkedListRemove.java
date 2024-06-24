package collectionLinkedList;

import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) {
		LinkedList <String> listObj = new LinkedList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " + listObj);
		
		listObj.remove(3);
		System.out.println("Array after removing 3rd index " +listObj);
		
		listObj.remove("Cat");
		System.out.println("Array afterremoving Cat value: "+ listObj);
	}

}
