package algo.day2;

public class 준태_hot문제1 {

	public static void main(String[] args) { // 시작
		// TODO Auto-generated method stub

		// 변수선언
		double hp = 250;	// h시 인구
		double hu = 0.036;	// h시 인구증가율
		double hup = 0;	// 증가된 h시 총 인구
		
		double kp = 180;	// k시 인구
		double ku = 0.042;	// k시 인구증가율
		double kup = 0;	// 증가된 k시 총 인구
		
		int y = 1999;	// 기준연도
		int c= 0;	// 카운터
		int sum;	// 출력변수(k시인구>h시인구 년도)
		
		//
		while (kp<=hp) {
			hup = hp * hu; // (250 * 0.036)
			hp = hp + hup;
			
			kup = kp * ku; // (180 * 0.042)
			kp = kp + kup;
			
			c=c+1;
			sum = y + c;
			System.out.println(sum);
		}
	} // 종료

}
