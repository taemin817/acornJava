package day14;

public class Score2 {

	public static void main(String[] args) {

		Score score = new Score("이름", 50, 90);
		Score score2 = new Score("누구냥",100, 100);
		
		if(score.equals(score2)) {
			System.out.println("같은 학생이다");
		}else {

			System.out.println("같은 학생이 아니다");
		}
		
		Object o = score;
		Object o2= score2;
		
		if( o.equals(o2)) {
			System.out.println("같은 학생이다");
		}else {
			System.out.println("같은 학생이 아니다");
		}
		
	}


}
