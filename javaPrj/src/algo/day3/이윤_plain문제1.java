package algo.day3;

public class 이윤_plain문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1~99 홀수의 누적 합
		
		int n=1;
		int sum=0;
		final int MAX = 99;
		while (n<=MAX) {
			sum+=n;
			n+=2;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
