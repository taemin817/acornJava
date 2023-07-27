package day05;

import java.util.Scanner;

public class answer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch
		
		// 입력 : 주문수량 qty  메뉴 menu
		// 출력 : 주문금액 amount
		// 준비 : 메뉴별단가
			/*
			 아메리카노 2000
			 카푸치노 3000
			 모카라떼 4000
			 */
		
		/*
		 1. 메뉴, 수량 입력
		 2. 메뉴에 해당하는 금액 구하기
		 3. 주문금액 출력
		 */
		
		String menu;
		int qty;
		
		int amount=0;
		
		int 아메리카노 = 2000;	//1
		int 카푸치노 = 3000;	//2
		int 모카라떼 = 4000;	//3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴와 수량을 입력해라");
		menu = sc.next();
		qty = sc.nextInt();
		
		switch(menu) {
			case "아메리카노" :
				amount = 아메리카노 * qty;
				break;
			case "카푸치노" :
				amount = 카푸치노 * qty;
				break;
			case "모카라떼" :
				amount = 모카라떼 * qty;
				break;
			default :
				System.out.println("고마해라");
				break;
		}
		System.out.println(amount);
	}

}
