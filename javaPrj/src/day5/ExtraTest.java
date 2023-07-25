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
		
        double avg = 0.0;
        double kor_avg, eng_avg, math_avg;
        double sum;
        int kor_sum = 0;
        int eng_sum = 0;
        int math_sum = 0;
        
        final int MAX = 3;
        final int SUBJECT = 3;

        Scanner sc = new Scanner(System.in);
        
        for(int i=1; i<=MAX; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            sum = kor + eng + math;
            avg = sum/SUBJECT;
            kor_sum += kor;
            eng_sum += eng;
            math_sum += math;

            if(avg>=90){
                System.out.println("이름 : " + name);
                System.out.println("국어 : " + kor);
                System.out.println("영어 : " + eng);
                System.out.println("수학 : " + math);
                System.out.println("평균 : " + avg);
                System.out.println("excellent");
            }else if
                (avg<60){
                    System.out.println("이름 : " + name);
                    System.out.println("국어 : " + kor);
                    System.out.println("영어 : " + eng);
                    System.out.println("수학 : " + math);
                    System.out.println("평균 : " + avg);
                    System.out.println("false");
                }else{
                    System.out.println("이름 : " + name);
                    System.out.println("국어 : " + kor);
                    System.out.println("영어 : " + eng);
                    System.out.println("수학 : " + math);
                    System.out.println("평균 : " + avg);
                }
            }
        
        kor_avg = kor_sum/MAX;
        eng_avg = eng_sum/MAX;
        math_avg = math_sum/MAX;

        System.out.println("국어 총평균 : " + kor_avg);
        System.out.println("영어 총평균 : " + eng_avg);
        System.out.println("수학 총평균 : " + math_avg);
    }
}