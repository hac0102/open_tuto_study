package com.hac.java.ch12.loop;

public class a3Break {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(" i : " + i);
		}
		
		System.out.println("break :::");
	}
}
