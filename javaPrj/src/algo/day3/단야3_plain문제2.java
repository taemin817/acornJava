package algo.day3;

public class 단야3_plain문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0; // 누적합
		
		// 처리
		int jsum=0; // 항알 구할 변수
		int i=1; // 반복제어변수
		
		final int MAX=5;
		
		while(i<=MAX) {
			jsum=jsum+i;
			sum=sum+jsum;
			i++;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
