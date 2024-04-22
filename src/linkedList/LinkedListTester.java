package linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTester {

	public static void main(String[] args) {
		

		List<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.rotate(list, 2);
		
		// Laufvariaböe für Collections
		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		itr = list.iterator();
//		while(itr.hasNext()) {
//			if(itr.next()==3) {
//				itr.remove();
//			}
//		}
//		itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//	}
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			if(itr.next()==3) {
				itr.remove();
			}
			System.out.println(itr.next());
		}
		
	}
}
