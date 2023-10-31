package com.tns.set;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetProg {

	public static void treeSetOperations() {
		TreeSet<Integer>num_treeset=new TreeSet<>();
		num_treeset.add(55);
		num_treeset.add(44);
		num_treeset.add(123);
		num_treeset.add(15);
		//num_treeset.add(null);
        System.out.println("treeset elements are"+num_treeset);
        //call iteration
        Iterator<Integer>iter=num_treeset.iterator();
        System.out.println("elements of iterator are");
        	while(iter.hasNext()) {
        		 System.out.println(iter.next());
        	}
	}

}
