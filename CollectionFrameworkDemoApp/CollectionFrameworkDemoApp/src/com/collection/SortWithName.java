package com.collection;

import java.util.Comparator;

public class SortWithName implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getPname().compareTo(p2.getPname());
	}


}
