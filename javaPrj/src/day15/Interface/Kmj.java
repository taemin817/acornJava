package day15.Interface;

import java.util.Scanner;

public class Kmj implements MyRunnable{

	@Override
	public void run() {
		
		System.out.println("몇개의 별을 찍을지 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		
		for(int i=0; i<su; i++) {
			System.out.print("*");
		}sc.close();
	}
}
