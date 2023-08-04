package day13.test;

import java.util.Scanner;

import com.ncs.acorn.MyCalculator;

public class test03 {
	

	public static void main(String[] args) {

		System.out.println("곱하기를 원하는 두 수를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		sc.close();
		System.out.println(MyCalculator.Multiple(su1, su2));
		
	}

	

}
