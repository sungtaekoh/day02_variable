package day02_variable;

import java.io.IOException;

public class Ex06 {
//	 �Է¹޴� ���
	
    public static void main(String[] args) throws IOException  {
        int val;
        System.out.print("�Է� : ");
        val = System.in.read();
        System.out.println("�Է� data : "+ (char)val);
//        system.in.read �Է¹޴� ����̴�
        /*
         * System.on.read�� ���� �ϳ��� �Է¹޴´�
         * �ܿ����� ���´� 
         * ex) ab�� �Է��ϸ� ���̸� ����̳����� b�� ���´�
         * a�� �Է��ϰ� ���͸� ������ ���Ͱ� ���´� 
         */
        
        System.in.read();
        System.in.read();
  /*        ���Ͱ��� �ΰ��� ������ ũ���̱⶧���� ���Ͱ��� �����ϰ� 2���� �Է��� �ޱ����ؼ���
        System.in.read�� ���� ���Ͱ��� ���־���Ѵ� */
        
        
        System.out.print("2��° �Է� : ");
        val = System.in.read();
        System.out.println("�Է� data : "+ (char)val);
        
        
    }
}    

  
