package day5;

import java.util.Scanner;

public class ExtraTest {

	public static void main(String[] args) {

		// 출력자료
		// 개인평균 avg  개인평균>=90 -> excellent  개인평균<60 -> fail
		// 국어평균 kor_avg  영어평균 eng_avg  수학평균 math_avg
		
		// 입력자료
		// 이름 name  국어 kor  영어 eng  수학 math
		
		// 처리자료
		// 반복변수 i  개인총점 sum  국어총점 kor_sum  영어총점 eng_sum  수학총점 math_sum
		
		//s.c max=3, subject =3
		
		double avg;
		double kor_avg;
		double eng_avg;
		double math_avg;
		
		final int MAX = 3;
		final int SUBJECT = 3;

		Scanner sc = new Scanner(System.in);

		String name;
		int kor=0; 
		int eng=0; 
		int math=0; 
		
		int sum = kor + eng + math;
		avg = sum/SUBJECT;
		int kor_sum = 0;
		kor_sum += kor;
		int eng_sum = 0;
		eng_sum += eng;
		int math_sum = 0;
		math_sum += math;
		
		for(int i=1; i<=MAX; i++) {
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
		if(avg >= 90) {
			System.out.println(name);
			System.out.println(kor);
			System.out.println(eng);
			System.out.println(math);
			System.out.println(avg);
			System.out.println("excellent");
		}else{
			if(avg < 60) {
				System.out.println(name);
				System.out.println(kor);
				System.out.println(eng);
				System.out.println(math);
				System.out.println(avg);
				System.out.println("fail");
			}else{
				System.out.println(name);
				System.out.println(kor);
				System.out.println(eng);
				System.out.println(math);
				System.out.println(avg);
			}
		}i++;
	}
		kor_avg = kor_sum/MAX;
		eng_avg = eng_sum/MAX;
		math_avg = math_sum/MAX;
		
		System.out.println(kor_avg);
		System.out.println(eng_avg);
		System.out.println(math_avg);
		
	}

}
