package com.hac.java.ch13.array;

public class a04ArrayLoop {
	public static void main(String[] args) {
		String[] arr = {"a", "b", "c"};
		
		for(int i = 0; i < arr.length; i++) {
			String result = arr[i];
			System.out.println(i + " : " + result);
		}
	}
}
