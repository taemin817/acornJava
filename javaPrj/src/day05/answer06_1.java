package day05;

import java.util.Scanner;

import day03.algo.if문;

public class answer06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 입력 : 임의의 수		su
	// 출력 : 짝수의 합		even_sum
	// 처리 : 반복제어변수 	i
	
	/*
	 처리과정
	 1. 반복 10번
	 	수를 입력
	 	짝수인 경우만 누적
	 2. 누적합 출력
	 3. 종료
	 	*/
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		int even_sum = 0;

		for (int i = 1; i <= 10; i++) {
			su = sc.nextInt();
			if(su%2 == 0){
				even_sum+=su;
			}
		}System.out.println(even_sum);
	}

}
