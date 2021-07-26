package day02_variable;

public class Quiz01 {
	public static void main(String[] args) {
//		형변환을 이용하여 에러를 해결하세요
//		크기를 확인하고 왜 그런지도 생각해 보세요
		
		byte b =97;
		short s = 20;
		char c = 'A';
		float f;
		s = b;//
		c = (char)b;//케릭터는 양수의 값만 바이트는 음수와 양수 모두
//		수용하는 값의 범위가 다르기때문에 오류가나온다
		
		s = (short)c;
		c = (char)s;
		f = (float)5.11; //double로 인식되기때문
		f = 5.11f;//(double이아닌 float으로 표현하겠습니다)
//		플롯을 넣어준다
//		빨간 줄을 없애라 왜 이렇게 되었는지도 생각해보자
	
	}
}
