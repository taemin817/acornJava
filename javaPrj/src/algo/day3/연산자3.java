package algo.day3;

import org.w3c.dom.ls.LSOutput;

public class 연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 관계(비교) 연산자 : > < >= <= == !=
		
		int myAge = 27;
		boolean result = myAge > 25; // true or false 
		System.out.println(result);
		
		boolean result2 = myAge >= 25;
		System.out.println(result2);
		
		boolean result3 = myAge < 25;
		System.out.println(result3);
		
		boolean result4 = myAge <= 25;
		System.out.println(result4);
		
		int yourAge=26;
		boolean result5 = yourAge == 26;
		System.out.println(result5);
		
		boolean result6 = yourAge != 27;
		System.out.println(result6);
		
		
		// 논리연산자 : 그리고&& 또는|| 논리부정!
		
		int kor=80;
		int eng=100;
		// 두 과목 모두 90 이상이면 장학금 지급
		boolean result7 = kor >= 90 && eng >= 90; // kor은 만족못하므로 false
		System.out.println(result7);
		
		// 두 과목 중 한과목이라도 90 이상이면 장학금 지급
		boolean result8 = kor >= 90 || eng >= 90; // eng은 만족하므로 true
		System.out.println(result8);
		
		boolean result9 = !(kor >= 80); // kor은 80이므로 true인데 이것을 부정하여 false
		System.out.println(result9);
		
		
		// 복합대입연산자 : += -= *= /= %=
		
		int num = 10;
		num = num+10; //20
		num+=10; //30
			
		// 삼항연산자
		int result10 = (15>3)?15:3;
		System.out.println(result10);
		
		// (조건식)?참:거짓
		int m=10;
		int n=15;
		int max = (m>n)?n:n;
		System.out.println(max); // 15
		
		}
	
}
