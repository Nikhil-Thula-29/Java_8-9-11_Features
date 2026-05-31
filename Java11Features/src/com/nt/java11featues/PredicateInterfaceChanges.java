package com.nt.java11featues;

import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceChanges {
	public static void main(String[] args) {
		List<String> names =
                List.of("Java", "", "Spring", "");

		//before java 11
        names.stream()
             .filter(x -> !x.isEmpty())
             .forEach(System.out::println);
        
        //After java 11 with not feautre in predicate
        System.out.println("With not predicate");
        names.stream().filter(Predicate.not((x)->x.isEmpty())).forEach(System.out::println);
        
        
	}
}
