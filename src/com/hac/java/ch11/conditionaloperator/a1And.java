package com.hac.java.ch11.conditionaloperator;

public class a1And {
	public static void main(String[] args) {
		
		//논리 연산자 and &&    두항이 모두 참일때  - 참
		//       or  ||    두항 중 하나만 참이면 - 참
		if (true && true) {
            System.out.println(1);
        }
 
        if (true && false) {
            System.out.println(2);
        }
 
        if (false && true) {
            System.out.println(3);
        }
 
        if (false && false) {
            System.out.println(4);
        }
        
        String id = args[0];
        String password = args[1];
        //id가 "egoing", password "111111" 일때 true
        if (id.equals("egoing") && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
		
	}

}
