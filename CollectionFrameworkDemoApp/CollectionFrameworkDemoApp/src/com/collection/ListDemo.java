package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {
	

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//Add Data
		al.add(10);
		al.add("sai");
		al.add(99785543l);
		al.add(88.5);
		al.add(10);
		System.out.println(al);
		System.out.println(al.size());

		//update data
		al.set(0, 20);
		System.out.println(al);
		
		//delete data
		al.remove(2);
		System.out.println(al);
		
		//get data
		System.out.println(al.get(2));
		
		//Traversing list data
		//forward direction
		/*Iterator it = al.iterator();
		while(it.hasNext()) {
			Object data = it.next();
			System.out.println(data);
		}*/
		
		//forward and backward direction data
		ListIterator li = al.listIterator();
		System.out.println("Forward data");
		while(li.hasNext()) {
			Object data = li.next();
			System.out.println(data);
	
		}
		System.out.println("Backward data");
		while(li.hasPrevious()) {
			Object data = li.previous();
			System.out.println(data);
	
		}
		


	}

}
