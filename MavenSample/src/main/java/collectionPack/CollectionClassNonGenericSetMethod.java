package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class CollectionClassNonGenericSetMethod {

	public static void main(String[] args) 
	{
		List list = new ArrayList();

		{
			list.add('A');
			list.add("Apple");
			list.add(6);
			list.add(1.1f);
			list.add(6);

		}
		System.out.println(list);

		list.set(2, "Cake");
		System.out.println(list);
	}

}
