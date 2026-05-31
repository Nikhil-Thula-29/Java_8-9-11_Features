package com.nt.java11featues;

import java.util.Arrays;

public class StringEnhancements {

	public static void main(String[] args) {
//		String s="Nikhil";
//		String s1= new String("Raju");
//		String s2="Nikhil";
//		String s3= new String("Raju");
//		System.out.println(s==s2); //true it is bcz of same reference memory location not same hashcode 
//		System.out.println(s1==s3); //false //bcz of different reference memory location.
//		System.out.println("s1 hashcode: "+s1.hashCode());
//		System.out.println("s2 hashcode: "+s3.hashCode());
//		String s4=new String("Nikhil").intern(); //bcz of intern it will store in string constant pool only.
//		System.out.println(s==s4);
//		
//		s.concat("Thula");
//		System.out.println(s); //Nikhil
//		s=s.concat("Thula");
//		System.out.println(s); //Nikhil Thula (we need to map variable)
//		s.substring(0, 2);
//		System.out.println(s); //NikhilThula
//		s=s.substring(0,2);
//		System.out.println(s); //Ni
//		System.out.println(s.concat(" Hello")); //Ni Hello
		
		//Java 11
		String x="ABab";
		x=x.repeat(2);
		System.out.println(x);
		//x=x.repeat(-2); //error Illegalexception
		// x=x.repeat(Integer.MAX_VALUE); //error Outofmemeory
		System.out.println(x);
		
		String k=" Nikhil Thula ";
		System.out.println(k.trim()); //both same remove leading and trailing spaces but the difference is it wont consider unicode values and not industury standard
		System.out.println(k.strip());  //both same remove leading and trailing spaces, strip consider unicode values like U2003 and it also remove from it so it is industry standard white space consideration.
		
		String r="\u2003 Java \u2003";
		System.out.println(r.strip()); //Java
		System.out.println(r.trim()); // Java 
		System.out.println(k.stripLeading()); 
		System.out.println(k.stripTrailing());
		
		String j="";
		String l="	";
		System.out.println(j.isBlank()); //true
		System.out.println(l.isBlank()); //true
		System.out.println(l.isEmpty()); //false
		System.out.println(j.isEmpty()); //true
		
		String text = "Java\nSpring\r\nMicroservices\rDocker";
		String[] s=text.split("\r");
		System.out.println("***********With split***********");
	     Arrays.stream(s).forEach(p -> System.out.println("[" + p + "]"));
		
		//so all the times we can not use split because there can be \n and \r and \n\r mix so lines is used as new features it internally detects
		System.out.println("***********With lines***********");
		text.lines().forEach(p-> System.out.println("[" + p + "]"));
	}
}
