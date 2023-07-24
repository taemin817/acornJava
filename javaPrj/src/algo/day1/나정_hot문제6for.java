package algo.day1;

public class 나정_hot문제6for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double = 실수
		double sum=0;	// 항의 누적합
		int multi=1;	// 분모
		int i=1;		// 항의 순번(반복제어변수)이자 분자
		final int MAX=10;
		int a=-1;		// 부호를 구할 변수
		double an;
		
		sum+=multi;		// sum=sum+multi
		for(i=i+1;i<=MAX;i++) {
			multi = i*multi; 
			an=(a*(i/(double)multi));
			sum = sum+(an);
			System.out.println(sum);
			a=-a;
		}
		System.out.println(sum);
	}

}

/*
0.0
0.5
0.33333333333333337
0.37500000000000006
0.3666666666666667
0.3680555555555556
0.3678571428571429
0.3678819444444445
0.3678791887125221
 */