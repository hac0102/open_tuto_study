package com.hac.java.ch13.array;

public class a03Length {
	public static void main(String[] args) {
		//String[] classGroup = { "ÃÖÁøÇõ", "ÃÖÀ¯ºó", "ÇÑÀÌ¶÷", "ÀÌ°íÀ×" };
		String[] classGroup = new String[4];
	    classGroup[0] = "ÃÖÁøÇõ";
	    System.out.println(classGroup.length);
	    classGroup[1] = "ÃÖÀ¯ºó";
	    System.out.println(classGroup.length);
	    classGroup[2] = "ÇÑÀÌ¶÷";
	    System.out.println(classGroup.length);
	    classGroup[3] = "ÀÌ°íÀ×";
	    System.out.println(classGroup.length);
	}

}
