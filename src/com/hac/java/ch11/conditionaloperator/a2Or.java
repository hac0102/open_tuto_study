package com.hac.java.ch11.conditionaloperator;

public class a2Or {
	public static void main(String[] args) {
		 if (true || true) {
			 System.out.println(1);
	     }
         
		 if (true || false) {
             System.out.println(2);
         }
         
		 if (false || true) {
             System.out.println(3);
         }
         
		 if (false || false) {
             System.out.println(4);
         }
		 
		 
		 
		 String id = args[0];
	        String password = args[1];
	        //id�� "egoing"/"k8805"/"sorialgi"�̰ų� ��ȣ��  "111111"�̸� true
	        if ((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi"))
	                && password.equals("111111")) {
	            System.out.println("right");
	        } else {
	            System.out.println("wrong");
	        }
	}

}
