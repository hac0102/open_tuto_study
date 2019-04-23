package com.hac.java.ch14.method;

public class a03Method3 {
	
	public static void numbering(int limit) {
		int i = 0;
		
		while(i < limit) {
			System.out.println("i ::" + i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(5);
	}

}
