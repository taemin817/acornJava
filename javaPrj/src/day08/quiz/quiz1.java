package day08.quiz;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// 두 수의 합을 구하는 함수 만들기

		plus();
	}

	public static void plus() {
		System.out.println("더하고 싶은 두 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		sum = a+b;
		System.out.println(a + "+" + b + " = "+sum);
		sc.close();
	}

}
