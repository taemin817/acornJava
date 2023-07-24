package algoPrj.day3;

import java.util.Scanner;

public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		/* for(초기식; 조건식; 증감식){
		반복해야할코드 작성}
		*/
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요");
		}
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("계속~");
			int su=sc.nextInt();
			if(su==0)break;
			System.out.println(su + "반복");
		}
		System.out.println("bye");
		
		while (true) {
			int su = sc.nextInt();
			if(su == 100) break;
			System.out.println(su+ "반복");
		}
	}

}
