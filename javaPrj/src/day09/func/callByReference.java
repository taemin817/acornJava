package day09.func;

public class callByReference {

	public static void main(String[] args) {

		int[] arr = {10, 9, 8, 5};
		printArr(arr);		// 배열의 참조값을 받음
		
		// 기본형 변수 : 데이터값을 저장하는 변수
		// 참조형 변수 : 참조값(주소값)을 저장하는 변수
		
		// call by reference
	}

	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
