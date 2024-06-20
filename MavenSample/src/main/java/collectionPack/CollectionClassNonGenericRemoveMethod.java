package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class CollectionClassNonGenericRemoveMethod {

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

		list.remove(2);
		System.out.println(list);

		list.remove("Apple");
		System.out.println(list);
	}

}
