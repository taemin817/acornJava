package day14.Exception;

import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {

		// 예외 발생하면 프로그래머가 해야할 일은 대비코드를 작성하는 것
		try {
			int a = System.in.read(); // 1byte만 (ASCII 코드로)읽어옴
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("예외 상황 발생");
			// System.exit(0); 시스템 종료
		}
		
		

	}

}
