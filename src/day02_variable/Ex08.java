package day02_variable;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("ù��° �� �Է� : ");
		n1 = input.next();
//		next��� ���� ������ �� �� ����
//		�����̽��� ������ ���ԵǸ� ���� ���� ���ڿ��� ���� ���ڿ��� ���� �ٸ��ɷ� �ν��Ѵ�
//		nextline�� ���Ͱ��� ��������
//		n2 = input.nextLine(); ������ �� �� �ִ�?
		System.out.println("�ι�° �� �Է� : ");
		n2 = input.next();
		System.out.println("ù��° �Է� �� : "+n1);
		System.out.println("ù��° �Է� �� : "+n2);
		
	}

}
