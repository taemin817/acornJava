package day08;

public class Ex03 {

	public static void main(String[] args) {
		int n =5;
		
		int result = getSum(n);
		System.out.println(result);
		
	}

	public static int getSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}

}
