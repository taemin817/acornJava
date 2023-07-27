package day05;

import java.util.Scanner;

public class answer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1~입력받은 수까지 sum
		
		int su;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		su = sc.nextInt();
		for(int i=1; i<=su;i++) {
			sum+=i;
		}
		System.out.println(sum);
	
		/*
		 1. 수 입력
		 2. 반복
		 	항을 구한다
		 	항을 누적한다
		 3. 항의 누적출력
		 4. 종료
		 */
	sc.close();
	}

}
