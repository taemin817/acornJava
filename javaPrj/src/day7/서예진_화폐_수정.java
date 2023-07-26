package day7;

import java.util.Scanner;

public class 서예진_화폐_수정 {

	public static void main(String[] args) {

	System.out.println("출장비 입력");
		
	Scanner sc = new Scanner(System.in);
	
	int money = sc.nextInt();	
	// 312510; 
	
	int[] moneys = new int[8];
	int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
	// 0    1    2    3    4    5    6    7: 배열의 index
	// 6    1    0    0    0    0    0    0: moneys
	// 오만	만	오천	  천	  오백	백	오십	  십: unit
	
	for(int i = 0; i<8; i++) {
			moneys[i] = money/unit[i];
			money = money-(unit[i]*moneys[i]);
	}
	// i = 0
	// moneys[0] = 312510 / unit[0]->50000
	// unit[0] = 50000 moneys[0] = 6
	// money = 312510-(50000*6) = 12510
	
	// i = 1
	// moneys[1] = 12510 / unit[1]->10000
	// unit[1] = 10000 moneys[1] = 1
	// money = 12510-(10000*1) = 2510

	// i = 2
	// moneys[2] = 2510 / unit[2]->5000
	// unit[2] = 5000 moneys[2] = 0
	// money = 2510-(5000*0-) = 2510
	
	// i = 3
	// moneys[3] = 2510 / unit[3]->1000
	// unit[3] = 1000 moneys[2] = 2
	// money = 2510-(1000*2) = 510

	// i = 4
	// moneys[4] = 510 / unit[4]->500
	// unit[4] = 500 moneys[4] = 1
	// money = 510-(500*2) = 10

	// i = 5
	// moneys[5] = 10 / unit[5]->100
	// unit[5] = 100 moneys[5] = 0
	// money = 10-(100*0) = 10

	// i = 6
	// moneys[6] = 10 / unit[6]->50
	// unit[6] = 50 moneys[6] = 0
	// money = 10-(50*0) = 10

	// i = 7
	// moneys[6] = 10 / unit[6]->10
	// unit[6] = 10 moneys[6] = 1
	// money = 10-(10*1) = 0
	
	// i = 8 !<8 end
	
	for(int i = 0; i<moneys.length; i++) {
		System.out.println(moneys[i]);
	}
	}

}
