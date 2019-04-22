package com.hac.java.ch10.condition;

public class a5Switch {
	public static void main(String[] args) {
		System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }

        System.out.println("switch(1) - break");
        switch(1){
        case 1:
        	System.out.println("one");
        	break;
        case 2:
        	System.out.println("two");
        	break;
        case 3:
        	System.out.println("three");
        	break;
        }

        System.out.println("switch(1) - break - default");
//        switch(1){
        switch(5){ //default
        case 1:
        	System.out.println("one");
        	break;
        case 2:
        	System.out.println("two");
        	break;
        case 3:
        	System.out.println("three");
        	break;
        default : 
        	System.out.println("default");
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
        
	}
}
