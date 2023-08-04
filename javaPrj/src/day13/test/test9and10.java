package day13.test;

public class test9and10 {

	public static void main(String[] args) {

		Score s1 = new Score("이학생", 90, 90);
		Score s2 = new Score("김학생", 80, 82);
		Score s3 = new Score("전학생", 60, 70);

		s1.calGrade();
		s2.calGrade();
		s3.calGrade();
		
		String result1 = s1.toString();
		String result2 = s2.toString();
		String result3 = s3.toString();
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
