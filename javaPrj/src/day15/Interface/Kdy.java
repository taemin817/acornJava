package day15.Interface;

import java.util.Scanner;

public class Kdy implements MyRunnable{

		@Override
		public void run() {
					
			System.out.println("원하는 단을 입력하세요.");
			Scanner sc = new Scanner(System.in);
			int su = sc.nextInt();
			 
			for(int i=su; i<=su; i++){
	            for(int j=1; j<=9; j++)
	            {
	                System.out.println(i+ "x" + j + "=" + i*j);
	            }
			}sc.close();
		}
	
	
	
}
