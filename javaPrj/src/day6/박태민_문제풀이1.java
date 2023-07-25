package day6;

import java.util.Scanner;

import 김민지_문제풀이.EvenSum_6;

public class 박태민_문제풀이1 {

	public static void main(String[] args) {
		
//		배열은 10개로 준비한다.
//		수를 10개 입력받아서 짝수인경우에만 배열에 저장하시오
//		짝수배열의 내용만큼만 모두 출력하시오

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int [10];				// 배열 10개 준비
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();				// 수를 10개 입력받고 저장
		}
		
		int[] even = new int [num.length];		// num배열 중에서 짝수만 even에 저장
		int evencnt = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i]%2 == 0) {					// 짝수인지 판단
				even[evencnt] = num[i];			// 짝수를 even배열에 저장
				System.out.print(even[evencnt] + " ");}
				evencnt++;						// 짝수 갯수만큼 even 배열의 크기 증가
		}
		
	}

}
