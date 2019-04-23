package com.hac.java.ch15.io;

import java.util.Scanner;

public class a03Scanner1 {
	public static void main(String[] args) {
		
		
		try{
			Scanner sc = new Scanner(System.in);
	        while(sc.hasNextInt()) {
	            System.out.println(sc.nextInt()*1000); 
	        }
	        
	        System.out.println("Á¾·á " );
	        sc.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("getStackTrace :: " + e.getStackTrace());
			System.out.println("getMessage ::" + e.getMessage());
		}
		
	}

}
