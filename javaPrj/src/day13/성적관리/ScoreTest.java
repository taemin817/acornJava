package day13.성적관리;

public class ScoreTest {

	public static void main(String[] args) {

		Score s = new Score("홍길동", 90, 90);

		s.calResult();
		//s.calReuslt(s) : s객체의 레퍼런스가 인자정보로 제공됨
		//
		
		String result = s.toString();
		
		System.out.println(result);
		System.out.println(s);
	}

}
