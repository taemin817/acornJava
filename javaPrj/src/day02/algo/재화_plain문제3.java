package day02.algo;

import java.util.Scanner;

public class 재화_plain문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력변수
		int num;
		
		// 출력변수
		int pos=0;
		int neg=0;
		int posEven=0;
		int posOdd=0;
		
		// 반복제어변수
		final int MAX=10;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		while (count<MAX) {
			count++; // count=count+1;
			num = sc.nextInt();
			
			if(num>0) {
				pos = pos+1; // pos=pos+1 = pos++, pos=++pos    *pos =/= pos++*
				if(num%2==0) {
					posEven++;
				}else {posOdd++;}
			}else {
				neg = neg+1;
			}
		}
		System.out.println(pos);
		System.out.println(neg);
		System.out.println(posEven);
		System.out.println(posOdd);
		sc.close();
	}
}
