package day07.func;

public class Ex03 {
				//void : 반환값이 없다
	public static void main(String[] args) { // 프로그램을 실행시키고 싶으면 반드시 main함수 내에
		
		// 같은 코드를 중복사용하면 코드의 양이 증가, 변경이 어렵고 실수가 발생, 많은 시간 소요

		printTitle();
		// 함수를 이용한 성적 타이틀 출력하는 코드
		// 만약 '='을 '*'로 바꿔달라는 요청이있다면?
	} //종료
	
	// 함수 : 특정 기능을 수행하는 코드블럭, 코드의 중복 제거
	//		 코드의 분할(코드가 너무 길 때), 함수협업 필요할때
	// printTitle : 함수명(기능에 맞게 작성)
	// 기능 : 성적표의 타이틀을 출력하는 기능
	// 입력 : 입력으로 받는 값
	// 반환 : 기능을 수행하고 반환하는 값
	// 사용 : 함수호출을 이용하여 실행. () 반드시 사용
	// ex. printTitle();

	public static void printTitle() {
		System.out.println("=성적표=");
		System.out.println("======");
		System.out.println("======");
	}
}