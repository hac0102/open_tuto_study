package com.hac.java.ch02;

public class a1NumberString {
	public static void main(String[] args) {
		
		//숫자
		// 자바에서는 ""따옴표가 없는 숫자는 숫자로 인식
		System.out.println(1 + 2);	//정수
		System.out.println(4 + 2);

		System.out.println(1.5 + 1.2);	//실수
		
		
		//문자
		
		//자바는 문자(Character)와 문자열(String)을 구분한다. 
		//문자는 한 글자를 의미하고, 
		//문자열은 여러 개의 문자가 결합한 것을 의미한다. 자바에서 문자는 '(작은따옴표)로 감싸야 한다. 
		System.out.println('생');
		System.out.println("생활");

		//문자는 그냥 "" 묶기
		System.out.println("생");		
		
		//문자열 더하기 +
		System.out.println("생활코딩" + "입니다");
		System.out.println("1" + "1");
		
		
		//이스케이프
		//System.out.println("egoing said "Welcome programming world"");
		System.out.println("egoing said \"Welcome programming world\"");
		//줄바꿈 문자 \n
		System.out.println("egoing said \n\"Welcome programming world\"");
		
		
		
	}

}
