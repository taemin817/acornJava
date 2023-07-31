package day10.others;

import java.util.Scanner;

import day10.classType.LeapYear;

public class 김재열_leapyeartest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하시오");
		int year = sc.nextInt();

		
		String result = LeapYear.leapYearCheck(year); //윤년 판단
		System.out.println(result);

	}

}
