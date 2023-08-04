package day13.test;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		System.out.println("1부터 어떤 수까지 더하고 싶나요. 입력하세요>");
		
		Scanner wantsu = new Scanner(System.in);
		int su = wantsu.nextInt();

		System.out.println(getTotal(su));
		wantsu.close();
	}

	public static int getTotal(int su) {
		int sum = 0;
		for(int i = 1; i <= su; i++) {
			sum+=i;
		}
		return sum;
	}

}
