package com.hac.java.ch7.typeconversion;

public class a1TypeConversion {
	public static void main(String[] args) {
		
		//자동 형 변환 - 암시적 형변환
		//dobule형   = float형  자동으로 형변환
//		double a = 3.0F;
		
		//데이터 크기
		//byte < short < int < long < float < double 
		//형변환 가능
		//byte -> short -> int -> long -> float -> double
		
		//float = double형   double형 데이터크기가 크기떄문에 float형으로 변환할떄 데이터 손실이 일어나므로 자동형변환 안됨
//		float b = 3.0;
		
		
		int a = 3;
		float b = 1.0F;
		double c = a + b;	//int a 정수 -> 실수형태로 자동 형변원  a = 3.0 // 3.0F + 1.0F // c = 4.0표시
		System.out.println(c);
		
		
	}

}
