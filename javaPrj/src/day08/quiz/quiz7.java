package day08.quiz;

import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {
		// 짝수(2~10), 홀수(1~9)를 반환하는 함수 만들기

		int[] fuck = even();
		for (int i = 0; i < fuck.length; i++) {
			System.out.print(fuck[i] + " ");
		}
		System.out.println();

	}

	public static int[] even() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 입력한 수까지의 짝수를 알려줍니다");
		int su = sc.nextInt();
		sc.close();
		int[] evensu = new int[su/2];  //    0 1 2 3 4 
		                               //    2 4 6 8 10
		int j = 0; // index  배열 
		for(int i = 1; i <=su; i++) {   //  1  2  3  4 5 6  7 8 9 10
			if(i%2 == 0) {
				 evensu[j]=i;     
				 j++;				
			}
		}
		return evensu;
	}
	
	
}
