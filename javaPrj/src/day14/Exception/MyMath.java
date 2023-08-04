package day14.Exception;

public class MyMath {
												// 예외 던지기, 미루기
	public int add(int num1 , int num2) throws NegativeNumberException1 {

		if(num1 < 0 || num2 < 0) {
			// 예외발생 시키기(일으키기)
			// 예외발생 시키기는 키워드 throw
			throw new NegativeNumberException1();
		}
		return num1 + num2;
	}
	
	public int add2(int num1 , int num2) {

		if(num1 < 0 || num2 < 0) {
			// 예외발생 시키기(일으키기)
			// 예외발생 시키기는 키워드 throw
			throw new NegativeNumberException2();
		}
		return num1 + num2;
	}
}