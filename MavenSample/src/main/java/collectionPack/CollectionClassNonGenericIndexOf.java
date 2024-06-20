package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class CollectionClassNonGenericIndexOf {

	public static void main(String[] args) 
	{
		List list = new ArrayList();
		
		{
			list.add('A');
	        list.add("Apple");
	        list.add(6);
	        list.add(1.1f);
	        list.add(6);
			
			int firstOccurrence = list.indexOf(6);//indexof() to find the first occurrence of 2 in the set 
			System.out.println(firstOccurrence);
			int lastOcuurrence = list.lastIndexOf(6);//lastindexof() to find last occurrence
			System.out.println(lastOcuurrence);
	}

}
}
