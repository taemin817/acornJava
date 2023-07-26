package day7;

import java.util.Scanner;

public class 김민지_화폐 {

	public static void main(String[] args) {

//		고액권부터  화폐매수구하기
//		예시)  325100    =>  6  2   1  0   0  1 0 0
//
//		화폐단위  50000 10000 5000 1000 500 100 50 10 
//
//
//		출장비가 입력될 때 
//		고액권부터 매수 구하기
//
//
//		화폐단위배열을 사용할 수 있다
//		화폐를 구하는 방식으로 해결할 수 있다  
//		 - 화폐단위 50000   으로 시작해서  /5   /2  의 방식으로 구해 질 수 있다
		

		System.out.println("출장비를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int money=sc.nextInt();
		int rem=money;
		
		int money50000=rem/50000;
		rem=rem%50000;
		
		int money10000=rem/10000;
		rem=rem%10000;
		
		int money5000 = rem/5000;
		rem=rem%5000;
		
		int money1000=rem/1000;
		rem=rem%1000;
		
		int money500=rem/500;
		rem=rem%500;
		
		int money100=rem/100;
		rem=rem%100;
		
		int money50=rem/50;
		rem=rem%50;
		
		int money10=rem/10;
		rem=rem%10;
		
		System.out.println("50000 => "+money50000+" 10000 => "+money10000+" 5000 => "+money5000+" 1000 => "+money1000+" 500 =>" +money500+" 100 => " + money100+" 50 => "+money50+" 10 => "+ money10);
			

	}

}
