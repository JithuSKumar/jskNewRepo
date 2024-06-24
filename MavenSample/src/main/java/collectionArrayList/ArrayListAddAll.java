package collectionArrayList;

import java.util.ArrayList;

public class ArrayListAddAll {

	public static void main(String[] args) {
		ArrayList <String> listObj = new ArrayList<String>();
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
		System.out.println(listObj);
	}

}
