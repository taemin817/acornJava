package day09.func;

public class reusable {

	public static void main(String[] args) {

		int su1 = 9, su2 = 5;
		int sum = su1 + su2;
		System.out.println(sum);
		int result = adder(su1, su2);
		
	}
	
										     // 기능이랑 어울리게, 첫글자는 소문자
	// public static (반환타입 1개, 없을 땐 void) 함수이름(입력정보)
	// 복잡한 데이터를 반환 -> 배열이나 객체 사용
	
	/*
	 * 기능 : 두 수를 더하는 기능
	 * 작성자 : 탬
	 * 입력정보 : 정수 두개
	 * 반환정보 : 두 정수의 합
	 */
	public static int adder(int su1, int su2) {
		int sum = su1 + su2;
		return sum;
	}
	
}
