package com.hac.java.ch7.typeconversion;

public class a1TypeConversion {
	public static void main(String[] args) {
		
		//�ڵ� �� ��ȯ - �Ͻ��� ����ȯ
		//dobule��   = float��  �ڵ����� ����ȯ
//		double a = 3.0F;
		
		//������ ũ��
		//byte < short < int < long < float < double 
		//����ȯ ����
		//byte -> short -> int -> long -> float -> double
		
		//float = double��   double�� ������ũ�Ⱑ ũ�⋚���� float������ ��ȯ�ҋ� ������ �ս��� �Ͼ�Ƿ� �ڵ�����ȯ �ȵ�
//		float b = 3.0;
		
		
		int a = 3;
		float b = 1.0F;
		double c = a + b;	//int a ���� -> �Ǽ����·� �ڵ� ������  a = 3.0 // 3.0F + 1.0F // c = 4.0ǥ��
		System.out.println(c);
		
		
	}

}
