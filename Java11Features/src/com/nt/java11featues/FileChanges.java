package com.nt.java11featues;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileChanges {

	public static void main(String[] args) throws IOException {
		//Before 11 we have used File class now we can use Path and File also to read and write
		Path path=Path.of("C:\\Notes\\JavaNotePadTest\\Test.txt");
		// BufferedReader br =new BufferedReader(new FileReader(file)); //this is old way
		String con=Files.readString(path); //new style
		System.out.println(con);
		Path p=Files.writeString(path, "This is testing the content is adding or overriding or not", StandardOpenOption.APPEND); //or StandardOpenOption.TRUNCATE_EXISTING
		String pcon=Files.readString(p);
		System.out.println(pcon);	
	}
}
