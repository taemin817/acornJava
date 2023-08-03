package day12.객체배열;

public class ScoreTest {

	public static void main(String[] args) {

		Score s1 = new Score("01", 50, 30, 60);
		Score s2 = new Score("02", 55, 100, 88);
		Score s3 = new Score("03", 98, 85, 72);

		System.out.println(s1.toString());
		System.out.println(s2); //toString 생략
		System.out.println(s3);
		System.out.println();
		// s1 s2 s3과 같이 참조형변수를 배열로 만듦
		
		
		// 참조형 변수의 기본값 null로 초기화
		Score[] arr = new Score[3];	// Score 객체 생성xxxxxx
		// String result = arr[0].toString();
		// nullPointerException
		
		arr[0] = new Score("01", 50, 30, 60);
		arr[1] = new Score("02", 55, 100, 88);
		arr[2] = new Score("03", 98, 85, 72);
		
		for(Score score:arr) {
			System.out.println(score);
		// = System.out.println(score.toString());
		}
	}

}
