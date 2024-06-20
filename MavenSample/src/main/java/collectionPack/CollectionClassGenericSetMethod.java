package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class CollectionClassGenericSetMethod {

	public static void main(String[] args) 
	{
		 List<String> list = new ArrayList<String>();
		{
       list.add("Apple");
       list.add("Ball");
       list.add("Cat");
       list.add("Dog");
       
		}
		System.out.println(list);
		
		list.set(2, "Cake");
		System.out.println(list);
	}
	}


