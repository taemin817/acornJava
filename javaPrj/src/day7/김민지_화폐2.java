package day7;

import java.util.Scanner;

public class 김민지_화폐2 {

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
		
		
		int[] unit= {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] arr=new int[8]; 
		int rem=money;
		
		for(int i=0; i<unit.length; i++) {
			arr[i]=rem/unit[i];
			rem=rem%unit[i];
		}
		
		for(int i=0; i<unit.length; i++) {
			System.out.print(unit[i]+"=>"+arr[i]+" ");
		}
	}

}
