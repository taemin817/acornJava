package day08.quiz;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class MyLib {

	public static void main(String[] args) {
//		Integer.parseInt("25") ;   기능 만들어 보기
//			MyLib 클래스 작성
//			함수이름    int  parseInt( String  str) 
//			char    ch = str.charAt(0) ;    // '2'
//			char   ch2 = str.charAt(1) ;    // '5'
		
//			int su=  Integer.parseInt("25") ;
//			프로그램에서 "25"  문자열 "25 " => 숫자로 바꿔주는 기능 25
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		char[] arr = new char[num.length()];
		for(int i = 0; i<num.length(); i++) {
			arr[i] = num.charAt(i);
		}
	}
	public static int parse(char[] arr) {
		for(int i=0; i < arr.length; i++) {
			int su = arr[i]-48;
		}
	}

}
