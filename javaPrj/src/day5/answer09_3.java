package day5;

import java.util.Scanner;

import algo.day3.for문;

public class answer09_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력 : 단 정보 dan
		// 출력

		Scanner sc = new Scanner(System.in);
		int dan =3;
		dan = sc.nextInt();
		
		for(int i=1; i<=9; i++){
			System.out.println(dan*i);
		}
		sc.close();
		
	}

}
