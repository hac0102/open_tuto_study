package com.hac.java.ch12.loop;

public class a4Continue {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(" i : " + i);
		}
	}

}
