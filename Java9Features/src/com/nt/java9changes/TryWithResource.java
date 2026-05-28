package com.nt.java9changes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {
	

    public static void main(String[] args) throws FileNotFoundException {

    	//example upto java 8
        try(FileInputStream fis =
                new FileInputStream("abc.txt")) {

            System.out.println("File Opened");

        } catch(Exception e) {
            e.printStackTrace();
        }
        
        
        //after java 9 we can call fis1 and sc in shortcut
        FileInputStream fis1 =new FileInputStream("abc.txt");
        Scanner sc = new Scanner(System.in);
        try (fis1;sc) {

            System.out.println("File Opened");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}