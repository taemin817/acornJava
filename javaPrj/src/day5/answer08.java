package day5;

import org.w3c.dom.ls.LSOutput;

import algo.day3.for문;

public class answer08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 별*을 3*3으로 출력
		
		for(int i=1; i<=3; i++) {
			System.out.print("*");}
		System.out.println();
		for(int i=1; i<=3; i++) {
			System.out.print("*");}
		System.out.println();
		for(int i=1; i<=3; i++) {
			System.out.print("*");}
		System.out.println();
		
// 다중 for문
		
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				System.out.print("*");
			}System.out.println("");
		}
		
	}

}
