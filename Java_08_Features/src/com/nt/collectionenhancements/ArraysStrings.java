package com.nt.collectionenhancements;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysStrings {

	public static void main(String[] args) {
		
		//Arrays
		Integer[] arr= {1,2,3,4};
		Arrays.stream(arr).forEach((x)->System.out.println(x));
		Stream<Integer> st=Arrays.stream(arr);
		System.out.println(Arrays.toString(st.toArray()));
		
		int[] arr1= {1,33,44,55,99};
		IntStream sts=Arrays.stream(arr1);
		System.out.println(Arrays.toString(sts.toArray()));
		
		int[] arrww = {1,2,3,4,5,6};
		Arrays.stream(arrww).forEach((x)->System.out.println(x));
		System.out.println(Arrays.toString(arrww));
		
		int[] arr2 = {1,2,3,4};
		System.out.println(Arrays.stream(arr2).map((x)->x*x).boxed().collect(Collectors.toList())); //rem we need to use boxed in arrays 
		
		Integer[] arr3 = {5,2,8,1};
		Arrays.stream(arr3).sorted().forEach((x)->System.out.println(x));
		System.out.println("Reverse order");
		Arrays.stream(arr3).sorted(Collections.reverseOrder()).forEach((x)->System.out.println(x));
		int sum=Arrays.stream(arr3).reduce(0,(x,y)->x+y);
		System.out.println("SUM: "+sum);
		
		
		Comparator<Integer> comp=Comparator.comparing((x)->x);
		System.out.println(Arrays.stream(arr3).max(comp).get());
		
		//Strings
		String s="JAVA";
		s.chars().forEach((x)->System.out.println((char) x));
		System.out.println(s.chars().count());
		s.chars().map((x)->Character.toUpperCase(x)).forEach((x)->System.out.println((char)x));
		
		String stds = "education";
		long count=stds.chars().filter(x-> x=='a' ||
		         x=='e' ||
		         x=='i' ||
		         x=='o' ||
		         x=='u').count();
		System.out.println(count);
		
		String stream="Java Stream API";
		long counts=Arrays.stream(stream.split(" ")).count();
		System.out.println("Count is :"+counts);
		
		
		String rev = "JAVA";
		String reve=Arrays.stream(rev.split("")).reduce("",(a,b)->b+a);
		System.out.println(reve);
		
		char[] ch=rev.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
		
		Stream<String> str=Stream.of("Java","Javascript","Python");
		str.forEach((x)->System.out.println(x));
		System.out.println(str.count());
		
		
	}
}
