package day08.quiz;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		// 자신이 만든 화폐구하기를 함수 만들기
		gogogo();
	}

	public static void gogogo() {
		int [] paper = new int[8]; 							// 화폐단위의 갯수만큼 배열 설정 
		int first = 100000;		   							// 배열의 0번째가 5만원이 나오기 위한 수
		for(int j=0; j<8; j++) {
			if(j%2==0) {first=first/2;						// 배열의 순서가 짝수면 /2
					System.out.print((paper[j]=first) + " ");}
					j++;
			if(j%2!=0) {first=first/5;						// 배열의 순서가 홀수면 /5
					System.out.print((paper[j]=first) + " ");}
		}System.out.println();
		
//		출장비가 입력될 때 고액권부터 매수 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출장비를 입력하세요");
		
		int away = sc.nextInt();							// 출장비 입력
		int i = 0;	
		
		System.out.println("필요한 화폐단위별 갯수는");
		
		for(i = 0; i < paper.length; i++) {					// 반복제어 및 배열순서 변수
			int need = away/paper[i];						// 필요한 화폐단위 (입력된 금액을 화폐단위로 나눈 몫)
			away = away%paper[i];							// 입력된 금액에서 화폐를 지불한 나머지
			System.out.println(paper[i] + " : " + need + "개");
		}
			System.out.println("입니다");
			sc.close();
	}

}
