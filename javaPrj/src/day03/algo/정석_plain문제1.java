package day03.algo;

public class 정석_plain문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;
		int n=1;
		
		while (n<=99) {
			sum+=n;
			n+=2;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}