package algo.day3;

public class 지원_hot문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0; // 항의 누적 구할 변수
		int n=0; // 반복제어변수
		int a=2; // 항을 구할 변수
		int b=3; // 공비

		while (n<7) {
			sum=sum+a; // sum+=a;
			a=a*b;
			n++;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
