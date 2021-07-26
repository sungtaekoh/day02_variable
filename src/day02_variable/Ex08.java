package day02_variable;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("첫번째 값 입력 : ");
		n1 = input.next();
//		next라는 값은 공백을 줄 수 없다
//		스페이스바 공백을 쓰게되면 서로 앞의 문자열과 뒤의 문자열을 서로 다른걸로 인식한다
//		nextline은 엔터값을 가져간다
//		n2 = input.nextLine(); 공백을 줄 수 있다?
		System.out.println("두번째 값 입력 : ");
		n2 = input.next();
		System.out.println("첫번째 입력 값 : "+n1);
		System.out.println("첫번째 입력 값 : "+n2);
		
	}

}
