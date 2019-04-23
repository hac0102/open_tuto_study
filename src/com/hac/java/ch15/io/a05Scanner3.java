package com.hac.java.ch15.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class a05Scanner3 {
	 public static void main(String[] args) {
	        try {
	            File file = new File("out.txt");
	            Scanner sc = new Scanner(file);
	            while(sc.hasNextInt()) {
	                System.out.println(sc.nextInt()*1000); 
	            }
	            sc.close();
	        } catch(Exception e){
	            System.out.println(e.getStackTrace());
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	        }
	 }
}
