package com.hac.java.ch14.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class a06Method6 {
	public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while (i < limit) {
            output += i;
            i++;
        }
        return output;
    }
 
    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
        try { // ����
            // ���� ���� out.txt ��� ���Ͽ� numbering�̶�� �޼ҵ尡 ��ȯ�� ���� �����մϴ�.
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
        	
        }
        } // ����
}
