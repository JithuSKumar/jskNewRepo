package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class CollectionClassGenericGet {

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
		
		String thirdElement = list.get(2);
        System.out.println("Third element: " + thirdElement);
		
		
	}

}
