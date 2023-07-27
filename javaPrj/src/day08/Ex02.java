package day08;

public class Ex02 {

	public static void main(String[] args) {
		int n = 5;
		extracted(n);
	}

	public static void extracted(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

		

}
