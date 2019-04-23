package com.hac.java.ch12.loop;

public class a5LoopDepth {
	public static void main(String[] args) {
//		 for (int i = 0; i < 10; i++) {
//	            for (int j = 0; j < 10; j++) {
//	                System.out.println(i + "" + j);
//	            }
//	     }
		 
		 
		 for(int who_is_first = 0; who_is_first < 10; who_is_first++){
			 for(int who_is_firstt=0; who_is_firstt < 10; who_is_firstt++){
				 if((who_is_first %3 == 0) && (who_is_firstt %3 == 0)) {
					 continue;
				 }
				 System.out.println(who_is_first+ "" + who_is_firstt);
			 }
		 }
	}

}
