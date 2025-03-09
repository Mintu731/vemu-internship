package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListWithRealObject {

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList();
		
		//products data
		Product p = new Product(1001,"LG",10000);
		Product p1 = new Product(3001,"RealMe",30000);
		Product p2 = new Product(2001,"Samsung",15000);

		//add data
		al.add(p);
		al.add(p1);
		al.add(p2);
		
		//Sort data
		//Collections.sort(al,new SortWithPrice());
		Collections.sort(al,new SortWithName());

		//get product details 
		Iterator<Product> it = al.iterator();
		while(it.hasNext()) {
			
			Product pro = it.next();
			System.out.println(pro.getPid()+" "+pro.getPname()+ " "+pro.getPrice());
		}
		


	}

}
