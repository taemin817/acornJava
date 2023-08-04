package day13.String;

public class Ex02 {

	public static void main(String[] args) {

		String str = new String("hello");
		// 문자열 = 속성(char[])+기능
		// 문자열 수정 불가
		
		char result1 = str.charAt(0); // charAt(0)->'h'
		System.out.println(result1);

		// str 문자열 객체의 내용을 바꿀 수 없다
		String result2 = str.replace('h', 'g');
		
		// 원본의 문자열이 수정되는 것이 아니다..!
		System.out.println(result2);
		System.out.println(str);
		
		String result3 = str.toUpperCase();
		System.out.println(result3);
		
		String date = new String("2023-08-17");
		String[] result4 = date.split("-");
		System.out.println();
		// "2023-08-17"
		// String[] r = new String[3};
		// r[0] = "2023"
		// r[1] = "08"
		// r[2] = "17"
		// return r
		for(int i = 0; i<result4.length; i++) {
			System.out.println(result4[i]);
		}
		
		System.out.println();
		//overloading : 메서드이름은 같고 매개변수는 다르다
								// 시작인덱스부터 끝까지
		String result5 = date.substring(5);
					//substring(시작인덱스0, 설정한인덱스5-전까지-)	
		String result6 = date.substring(0,5);
		System.out.println(result5);
		System.out.println(result6);
		
		System.out.println("문자열의 길이 = " + date.length());
		System.out.println();
		String s1 = "hello";
		String s2 = "hello";
		
		// 문자열의 비교는 equals() 사용해야함
		boolean result7 = s1.equals(s2);
		System.out.println(result7);
	
	}

}
