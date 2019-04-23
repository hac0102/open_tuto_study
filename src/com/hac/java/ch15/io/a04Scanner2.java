package com.hac.java.ch15.io;

import java.util.Scanner;

public class a04Scanner2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i * 1000);
		sc.close();
		
	}

}
