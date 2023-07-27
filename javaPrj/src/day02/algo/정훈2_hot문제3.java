package day02.algo;

public class 정훈2_hot문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a, b;
		a=b=1;
		int n = 2;
		
		final int MAX = 50;
		
		System.out.println(a+" "+b);
		
		while(n<MAX) {
			b = a+b;
			a = b-a;
			n=n+1;
			System.out.println(b);
		}
	}

}
