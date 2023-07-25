package day6;

import java.util.Scanner;

public class 박태민_문제풀이2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;							// sum 선언 및 초기화
		int[] su = new int [10];				// 배열 10개 준비
		for(int i = 0; i < su.length; i++) {
			su[i] = sc.nextInt();				// 수를 10개 입력받고 저장
			sum+=su[i];							// 배열의 모든 값 더하기
		}System.out.println(sum);				// 배열의 모든 값을 다 더한 결과 출력
		for(int i = 0; i < su.length; i++) {
			System.out.print(su[i] + " ");		// 배열의 모든 값 출력
		}

	}

}
