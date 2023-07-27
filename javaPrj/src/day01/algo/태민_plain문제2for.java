package day01.algo;

public class 태민_plain문제2for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for(int n=1; n<=100; n++) {
			sum=sum + n*(101-n);
		}
		System.out.println(sum);
	}

}
