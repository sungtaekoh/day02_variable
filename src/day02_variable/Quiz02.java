package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		String name;
		int kor;
		int eng;
		int math;
		
		
		System.out.println("����� �̸��� �����Դϱ�? : " );
		name = input.next();
        System.out.println("����� �̸��� �����Դϱ�? : "+name);
		
        System.out.println(name + "���� ���� ���� : ");
		kor = input.nextInt(); 
		System.out.println(name + "���� ���� ���� : "+ kor);
		
        System.out.println(name + "���� ���� ���� : " );
        eng = input.nextInt();
        System.out.println(name + "���� ���� ���� : "+ eng);
        
        System.out.println(name + "���� ���� ���� : " );
        math = input.nextInt();
        System.out.println(name + "���� ���� ���� : " + math);
       
        int total = kor + eng + math;
        
        System.out.println("==========================================");
        System.out.println("�̸� : " + name);
        System.out.println("==========================================");
        System.out.println("���� : " + kor);
        System.out.println("���� : " + eng);
        System.out.println("���� : " + math);
        System.out.println("==========================================");
        System.out.println("�հ� : " + total);
        System.out.println("==========================================");
        
		
		
		
	}
}
