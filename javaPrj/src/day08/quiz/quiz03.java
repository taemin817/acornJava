package day08.quiz;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		// 원하는 별을 출력하는 함수 만들기
		starry();
	}

	public static void starry() {
		Scanner sc = new Scanner(System.in);
		int star;
		System.out.println("*을 출력하고싶은 갯수를 입력하세요");
		star = sc.nextInt();
		for(int i = 0; i<star; i++) {
			System.out.print("*");
			sc.close();
		}
	}

}
