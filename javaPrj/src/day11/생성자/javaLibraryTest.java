package day11.생성자;

import java.util.Random;

public class javaLibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result1 = Math.abs(-34);
		System.out.println(result1);
		
		double result2 = Math.random();
		System.out.println(result2);
		
		Random r = new Random();
		int result3 = r.nextInt(100);
		System.out.println(result3);
	}

}
