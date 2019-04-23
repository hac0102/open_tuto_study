package com.hac.java.ch08.operator;

public class a4Division {
	
	public static void main(String[] args) {
		int a = 10;
	    int b = 3;
	      
	    float c = 10.0F;
	    float d = 3.0F;
	      
	    System.out.println(a/b);
	    System.out.println(c/d);
	    System.out.println(a/d);	//정수에서 실수를 나눔, 암시적 형변환 되고 정수 -> 실수로 된다
	}

}
