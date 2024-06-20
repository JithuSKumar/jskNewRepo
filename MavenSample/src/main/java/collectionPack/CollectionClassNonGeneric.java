package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class CollectionClassNonGeneric
{

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
	}

}
