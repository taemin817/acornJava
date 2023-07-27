package day03.algo;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 변수 : 메모리블럭, 기억장소(공간). 기억장소를 식별하기 위한 이름

		변수선언( 자료형 변수이름 ) ex) int a; 4byte를 확보
		
		자료형 : 공간의 크기와 해석방법을 제공
		
		 byte : 1byte=8bit (1bit=부호, 7bit=number  -128 ~ 127)
		 short : 2byte=16bit (-32768 ~ 32767)
		 int : 정수형. 4byte (약 -2147483648 ~ 2147483647)
		 long : 8byte=64bit (숫자뒤에 l이나 L을 붙여서 표현하기도 함)
		 
		 char : 문자형. 문자 하나를 저장할 수 있는 공간(2byte)
		 ex) char ch='a'; char ch2='한'
		 
		 double : 실수형. 소수이하 15자리 표현(8byte)
		 float : 소수이하 7자리 표현(4byte)
		 
		 boolean : 논리형(true:0이 아닌 값, false:00.)
		 
		 리터럴 : 값자체  ex) 10 9.9 'a' "hello" true
		 상수영역에 따로 저장(즉, 크기를 가진다)
		 정수형 리터럴 : int형 저장
		 실수형 리터럴 : double형 저장
		 */
		
		int iNum = 333; // 값이 상수영역에 저장되는 것, iNum이라는 기억장소에 저장되는 것 모두 ok
		// long iLong = 2_200_000_000; 상수영역의 int형 저장범위를 초과함
		long iLong2 = 2_200_000_000L; // 상수영역을 long형 저장범위로 바꿔줌
		
		double d = 23.3;
		// float f = 23.3; 상수영역에 저장되는 것은 문제가 없으나 변수가 float이라 문제
		float f2 = 23.3f; // 상수영역을 float형 저장범위로 바꿔줌
		
		char ch = 'a'; // ' ' 사용. 문자 하나를 저장.
		char ch2 = '박';
		System.out.println(ch);
		System.out.println(ch2);
		
		// 문자열 : " " 사용. 여러 문자의 모음.
		// "i love you"
		char[] str = {'i',' ','l','o','v','e',' ','y','o','u'};
		char[] str2 = new char[10];
		
		str2[0] = 'i';
		str2[1] = ' ';
		str2[2] = 'l';
		str2[3] = 'o';
		str2[4] = 'v';
		str2[5] = 'e';
		str2[6] = ' ';
		str2[7] = 'y';
		str2[8] = 'o';
		str2[9] = 'u';
		
		System.out.print("문자열 출력 : ");
		System.out.print(str2[0]);
		System.out.print(str2[1]);
		System.out.print(str2[2]);
		System.out.print(str2[3]);
		System.out.print(str2[4]);
		System.out.print(str2[5]);
		System.out.print(str2[6]);
		System.out.print(str2[7]);
		System.out.print(str2[8]);
		System.out.println(str2[9]);
		
		String str3 = "i love you";
		System.out.println(str3);
		
	}

}