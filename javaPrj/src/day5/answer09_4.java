package day5;

import java.util.Scanner;

import algo.day3.for문;

public class answer09_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력 : 단 정보 dan
		// 출력

		for(int i=1; i<=9; i++) {
			System.out.println(2*i);
		}
		/////////////////////////////////////
		
		for(int j=2; j<=9; j++) {			
			System.out.println(j+"단 출력");
			for(int i=1; i<=9; i++) {
				System.out.println(j*i);
			}
		}
		
	}

}
