package day08;

public class Ex09 {

	public static void main(String[] args) {

		// 지역변수
		// 변수의 유효범위
		// main에서 만든 변수는 main에서만 유효
		String[] days = new String[3];	// 인자, 반환 정보 활용
		int i = 0;
		insertDay(days, i);
		
		what(days, i);

	}

	public static void what(String[] days, int i) {
		System.out.println(days[i]);
	}

	public static void insertDay(String[] a, int index) {
		a[index] = "놀러가기";
	}

}
