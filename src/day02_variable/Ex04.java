package day02_variable;

public class Ex04 {
	
	public static void main(String[] args) {
		
		char ch = 'A';
		int num = 5, ret;
//		int = 5, int = ret
//		int num = 5는 num안에 5가 들어간다
//		int = ret은 안에 뭐가 들어가 있는지 모른다
		
		
		ret = ch + num;
		System.out.println("ret = "+ret);
		
		System.out.println("ret = "+(char)ret);
//		해당하는 숫자를 문자로 표현하겠습니다
		/*
		 * 자바에서는 모든 값을 유니코드로 표현한다
		 * 유니코드: 문자와 컴퓨터가 알아볼 수 있는 숫자를
		  규칙을 통해 정해 놓은것
		  
		  아스키 코드
		 * */
	}
}
