package day01.algo;

public class 태민_plain문제2while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수선언
		
		// n
		// sum
		// int : 자료형 <-변수선언시 정수값을 저장하기 위한 변수선언
		
		int n=0;
		int sum=0;
		
		while(n<100) { // 100미만일 때
			n=n+1;
			sum=sum+n*(101-n);
		}
		
		System.out.println(sum);
	}

}