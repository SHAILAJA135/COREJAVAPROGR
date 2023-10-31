package com.tns.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
          public static void operations() {
        	  Set<Integer>numSet=new HashSet<Integer>();
        	  //Add an element
        	  numSet.add(12);
        	  //add a list of elements to the set
        	  numSet.addAll(Arrays.asList(new Integer[] {1,5,6,9,3}));
        	  System.out.println("set elements are"+numSet);
        	 //size
            System.out.println("set elements are"+numSet.size());
            //create  a new set class and initialize with list of elements
            Set<Integer>oddSet=new HashSet<Integer>();
            oddSet.addAll(Arrays.asList(new Integer[] {1,3,5,7,9}));
            System.out.println("set elements are "+oddSet);
            //contains()
            System.out.println("numset contains element 3"+numSet.contains(3));
            // intersection=>retainAll
            Set<Integer>set_intersection=new HashSet<Integer>(numSet);
            set_intersection.retainAll(oddSet);
            System.out.println(set_intersection);
            //difference=>removeAll
            Set<Integer>set_difference=new HashSet<Integer>(numSet);
            set_difference.removeAll(oddSet);
            System.out.println(set_difference);
            //union=>addAll
            Set<Integer>union=new HashSet<Integer>(numSet);
            union.addAll(numSet);
            System.out.println(union);
          }
}
