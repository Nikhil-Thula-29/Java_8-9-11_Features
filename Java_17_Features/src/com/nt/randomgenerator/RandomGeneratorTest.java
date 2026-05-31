package com.nt.randomgenerator;

import java.util.Random;
import java.util.random.RandomGenerator;

public class RandomGeneratorTest {
	 public static void main(String[] args) {
		 //old method
		 Random rand=new Random();
		 System.out.println(rand.nextInt(122));
		 
		RandomGenerator gen=RandomGenerator.getDefault();
		System.out.println(gen.nextInt(100));
		
		RandomGenerator ran=RandomGenerator.of("L64X128MixRandom");
		System.out.println(ran.nextInt(20));
	}

}
