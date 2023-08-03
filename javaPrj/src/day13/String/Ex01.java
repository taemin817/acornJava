package day13.String;

public class Ex01 {

	public static void main(String[] args) {

		// 문자열을 생성하는 방법
		
		// "hello"가 한 번 생성
		// 정적영역(상수영역)에 생성. 레퍼런스만 제공받음
		String str0 = "hello";
		String str1 = "hello";
		// 문자열 수정 불가...?
		
		// heap메모리에 각각 생성
		String str2 = new String("hello"); 
		String str3 = new String("hello");
		// 문자열 수정 불가(final char[] value)
	}

}
