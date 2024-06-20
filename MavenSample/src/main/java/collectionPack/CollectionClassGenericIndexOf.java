package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class CollectionClassGenericIndexOf {

	public static void main(String[] args)
	{
		List <Integer> list = new ArrayList<Integer>();
		
		{
			list.add(2);
			list.add(3);
			list.add(2);
			list.add(22);
			
			int firstOccurrence = list.indexOf(2);//indexof() to find the first occurrence of 2 in the set 
			System.out.println(firstOccurrence);
			int lastOcuurrence = list.lastIndexOf(2);//lastindexof() to find last occurrence
			System.out.println(lastOcuurrence);
		}
	}

}
