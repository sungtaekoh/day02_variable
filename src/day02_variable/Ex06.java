package day02_variable;

import java.io.IOException;

public class Ex06 {
//	 입력받는 기능
	
    public static void main(String[] args) throws IOException  {
        int val;
        System.out.print("입력 : ");
        val = System.in.read();
        System.out.println("입력 data : "+ (char)val);
//        system.in.read 입력받는 기능이다
        /*
         * System.on.read는 문자 하나만 입력받는다
         * 잔여물이 남는다 
         * ex) ab를 입력하면 에이만 출력이나오고 b가 남는다
         * a를 입력하고 엔터를 누르면 엔터가 남는다 
         */
        
        System.in.read();
        System.in.read();
  /*        엔터값이 두개의 문자의 크기이기때문에 엔터값을 제외하고 2번재 입력을 받기위해서는
        System.in.read를 통해 엔터값을 뺴주어야한다 */
        
        
        System.out.print("2번째 입력 : ");
        val = System.in.read();
        System.out.println("입력 data : "+ (char)val);
        
        
    }
}    

  
