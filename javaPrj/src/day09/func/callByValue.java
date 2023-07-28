package day09.func;

public class callByValue {

	public static void main(String[] args) {
		int a = 5, b = 10;						// 5, 10 data
		int result = adder(a, b);
		
		int c = 9;
		int result2 = input(c);
		c = result2;
	}
	
	// 기본형 변수 : 데이터값을 저장하는 변수
	// 참조형 변수 : 참조값(주소값)을 저장하는 변수
	
	// call by value
	
	public static int adder(int su1, int su2) {	// su1 = 5, su2 = 10
	return su1+su2;
	}
	
	public static int input(int su) {
		return 5;
	}
}
