package day14.Exception;

import java.util.Scanner;

public class 예외테스트 {

	public static void main(String[] args) {

		MyMath m = new MyMath();
		
		int su1, su2;
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요>");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		try {
			m.add(su1, su2);
		} catch (NegativeNumberException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("음수를 입력해짜나");
		}
		
	}

}
