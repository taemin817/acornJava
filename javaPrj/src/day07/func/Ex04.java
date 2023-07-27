package day07.func;

public class Ex04 {
				//void : 반환값이 없다
	public static void main(String[] args) { // 프로그램을 실행시키고 싶으면 반드시 main함수 내에
		
		printTitle1();
		System.out.println();
		printTitle2();
		System.out.println();
		printTitle2();
		
	}
	// 함수를 이용한 성적 타이틀 출력하는 코드
	public static void printTitle1() {
		System.out.println("=성적표=");
		System.out.println("======");
		System.out.println("======");
	}// 만약 '='을 '*'로 바꿔달라는 요청이있다면?
	public static void printTitle2() {
		System.out.println("*성적표*");
		System.out.println("******");
		System.out.println("******");
	}
}