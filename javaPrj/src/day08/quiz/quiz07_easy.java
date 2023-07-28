package day08.quiz;

public class quiz07_easy {

	public static void main(String[] args) {
		// 짝수(2~10), 홀수(1~9)를 반환하는 함수 만들기

		int[] odd = oddNum();
		System.out.println();
		int[] even = evenNum();
		
	}

	public static int[] evenNum() {
		int[] even = {2, 4, 6, 8, 10};
		for(int i = 0; i < even.length; i++) {
			System.out.print(even[i] + " ");
		}return even;
	}

	public static int[] oddNum() {
		int[] odd = {1, 3, 5, 7, 9};		
		for(int i = 0; i < odd.length; i++) {
			System.out.print(odd[i] + " ");
		}return odd;
	}

}
