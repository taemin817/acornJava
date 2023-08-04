package day13.String;

public class Ex03 {

	public static void main(String[] args) {

		// 문자열의 변경
		StringBuilder a = new StringBuilder("hello\n");

		a.setCharAt(1, 'a');
		
		System.out.println(a);
		a.append("i like java");
		
		System.out.println(a);
	}

}
