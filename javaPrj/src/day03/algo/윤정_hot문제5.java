package day03.algo;

public class 윤정_hot문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//각 항에 3씩 곱하는 규칙
		
		int sum=2;
		int n=2;
		int i=1; // 반복제어 변수
		
		while(i<7) {
			n=n*3;
			sum=sum+n;
			i++;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
