package day11.생성자;

public class ScoreTest {

	public static void main(String[] args) {

		// 객체는 new 방식으로 공간을 확보
		// 확보된 공간의 주소(레퍼런스)를 저장한 뒤 사용
		// 반드시 참조형변수(주소를 저장하는 변수. 기본값 null-참조하고있지않음-) 필요
		
		Score_Do_Referece s = null;
		s = new Score_Do_Referece();
		s.printInfo();
		s.calResult();
		System.out.println();
		
		Score_Do_Referece s2 = new Score_Do_Referece("박태민", 100, 100, 100);
		s2.printInfo();
		s2.calResult();
		System.out.println();
		
		Score_Do_Referece s3 = new Score_Do_Referece("박태민");
		s3.printInfo();
		s3.calResult();
		System.out.println();
		
		Score_Do_Referece s4 = new Score_Do_Referece("민태박", 100, 100, 100);
		s4.calResult();
		String result4 = s4.toString();
		System.out.println(result4);
		System.out.println();

		// 메서드 오버로딩 : 메서드 이름이 동일하고 매개변수의 정보가 다른것
		// 메서드의 이름이 무겁다 = 이 이름으로 만들어진 메서드가 많다
		System.out.println("i like java");
		System.out.println(30);
		System.out.println(25.4);
		
		System.out.println(new char[] {'a','b','c'});
		// 위 아래는 같지만 표현하는 방식이 다른 것
		char[] chs = new char[] {'a','b','c'};
		System.out.println(chs);
	}

}
