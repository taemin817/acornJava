package algo.day2;

public class 정훈1_hot문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a=1;
		long b=1;
		int n=2;
		final int MAX=50;
		
		System.out.println(a+" "+b);
		
		while(n<MAX) {
			a=a+b;
			b=a+b;
			n=n+2;
			System.out.println(a+" "+b);
		}
	}
}
