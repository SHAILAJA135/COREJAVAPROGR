package com.tns.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer[] values=new Integer[] {3,4,8,5};
      Stream<Integer> stream =Arrays.stream(values);
      //map function
      System.out.println("square of no"+Arrays.toString(values));
      stream.map(num->num*num).forEach(System.out::println);
      //limit returns first 2 elements
      System.out.println("first 2 elements");
      Arrays.stream(values).limit(2).forEach(System.out::println);
      //skip first 2 elements
      System.out.println("skip first 2 elements");
      Arrays.stream(values).skip(2).forEach(System.out::println);
      //distinct element
      List<Integer>list=Arrays.asList(1,1,2,3,3,4);
      System.out.println("distinct elements");
      list.stream().distinct().forEach(System.out::println);
    //count distinct
      long c=list.stream().distinct().count();
      System.out.println(" count distinct elements");
       System.out.println(c);
       //data from list
       List<String>words=Arrays.asList("lakshmi","shailaja","sivani");
       Stream<String>stream1=words.stream();
       //map
       System.out.println(" strings in uppercase:");
       List<String>s1=stream1.map(str->str.toUpperCase()).collect(Collectors.toList());
       System.out.println(s1);
       //filter 
        List<Integer>s3=Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("filter the odd numbers:");
        s3.stream().filter(num->num%2==1).forEach(System.out::println);

}
}


