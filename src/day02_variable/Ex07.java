package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.println("�̸� �Է�: ");
		name = input.next();
		//���ڿ��� �Է¹޴� ���
//		�Է¹��� ���ڿ��� name�� ����ȴ�
		
		System.out.println("���� �Է�: ");
		age = input.nextInt();
//		������ �Է¹޴´�
//		�Է¹��� ������ age�� �Էµȴ�
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
//		�Է¹��� �̸��� ���̰� ��µȴ�
	
//		��ĳ�ʴ� ���� ����ҰŴ�
		
	}
}
