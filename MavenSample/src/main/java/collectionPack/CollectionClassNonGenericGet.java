package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class CollectionClassNonGenericGet {

	public static void main(String[] args)
	{
		List list = new ArrayList();
		{
			list.add('A');
	        list.add("Apple");
	        list.add(6);
	        list.add(1.1f);
       
		}
		System.out.println(list);
		
		Integer thirdPosition = (Integer) list.get(2);
        System.out.println("Third position: " + thirdPosition);
		
		String thirdElement = (String)list.get(1);
        System.out.println("Third element: " + thirdElement);
		
	
	}

}
