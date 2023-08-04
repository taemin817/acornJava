package day13.test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		
		System.out.println("원하는 구구단의 단을 입력하세요>");
		Scanner dan = new Scanner(System.in);
		int danNum = dan.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.printf("%d*%d = "+danNum*i+"\n",danNum,i);
		}dan.close();
	}

}
