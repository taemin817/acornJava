package algoPrj.day1;

public class 나정_hot문제6while {

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
		while(i<MAX) {
			i = i+1;
			multi = i*multi; 
			an=(a*(i/(double)multi));
			sum = sum+(an);
			System.out.println(sum);
			a=-a;
		}
		System.out.println(sum);
	}

}