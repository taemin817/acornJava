package day09.func;

public class referenceVariable {

	public static void main(String[] args) {

		int[] arr = new int[3];
			// arr -> 참조형(주소값을 저장하는) 변수
			// 자바는 배열부터는 new연산자(메모리요청) 사용, 반환값은 확보된 메모리 위치값 정보
			// 참조형 변수의 기본값 : null
		
		int a; // 기본형
		int b; // 기본형
		int[]c = new int[3]; // 참조형
		int[][]d = new int[3][2]; // 참조형
		String s; // 참조형
	}

}
