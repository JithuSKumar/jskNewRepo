package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class CollectionClassNonGenericContainsMethod {

	public static void main(String[] args) 
	{
		List list = new ArrayList();
		{
       list.add("Apple");
       list.add("Ball");
       list.add("Cat");
       list.add("Dog");
       
		}
		System.out.println(list);
		
		boolean a = list.contains("Dog");
		System.out.println("a: " +a);
		
		boolean b = list.contains("Cake");
		System.out.println("b: " +b);
	}

}
