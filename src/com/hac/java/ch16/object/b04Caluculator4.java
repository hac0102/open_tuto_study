package com.hac.java.ch16.object;

class Calculator{
	int left, right;

	public void setOprands(int left, int right){
		System.out.println("aaaa ::" + this);
	    this.left = left;		//this Ŭ������ ���ؼ� ������� �ν��Ͻ� �ڽ��� ����Ŵ
	    this.right = right;
	}
	  
	public void sum(){
	    System.out.println(this.left+this.right);
	}
	  
	public void avg(){
	    System.out.println((this.left+this.right)/2);
	}
}


public class b04Caluculator4 {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator(); 	// Calculator��ü ����  c1 �ν��Ͻ� - ��ü���� ��ü
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
          
        Calculator c2 = new Calculator();	// Calculator ������Ÿ�� �����̳� �� c2�� 
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }

}