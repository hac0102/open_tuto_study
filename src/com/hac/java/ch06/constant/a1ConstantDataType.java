package com.hac.java.ch06.constant;

public class a1ConstantDataType {
	public static void main(String[] args) {
		//변수 변하는 값
		//상수 변하지 않는 값
		
		//int a = 1;
		//1 = 3
		
		//int a = 2.2;
		//float a = 2.2;		//실수 float형 a = 실수 2.2 double형
		double a = 2.2;		//실수 double a = 실수 2.2 double형
		float b = 2.2F;     //명시적으로 float형으로 표시하면 가능
		
		
		//int a = 2147483648;  //오류 발생
		//long a = 2147483648;   //오류 발생
		long c = 2147483648L;   //명시적으로 long타입 표시
		
		///////////////////
		//자바는 byte,short 타입에 대해서는 int 형을 허용 
		//대신 byte,short 타입 데이터 크기는 벗어나면 안됨
		byte aa = 100;
		
	}

}
