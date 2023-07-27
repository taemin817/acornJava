package day08.quiz;

import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		// 일주일간의 날씨정보를 반환하는 함수 만들기(날씨정보는 임의 작성)

		String[] a = weather();
		String[] week = weeek();
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(week[i] + ":" + a[i]);
		}
		
	}
	
	public static String[] weather() {
		Scanner sc = new Scanner(System.in);
		
		String[] tem = new String[7];
		System.out.println("일주일간의 날씨정보를 일요일부터 입력하세요");
		for(int i = 0; i < tem.length; i++) {
			tem[i] = sc.next();
		}
		sc.close();
		return tem;
	}
	public static String[] weeek() {
		String[] week = {"일", "월", "화", "수", "목", "금", "토", "일"};
		return week;
	}


}
