package day07.func;

public class Ex07 {

	public static void main(String[] args) {

		// 1 to 10 sum 함수
		onetotensum();
		
	}

	public static void onetotensum() {
		System.out.println("program start");
		int sum=0;
		for(int i = 1; i <= 10; i++) {
			sum+=i;
		}
		System.out.println("합 : " + sum);
		System.out.println("program exit");
	}
}
