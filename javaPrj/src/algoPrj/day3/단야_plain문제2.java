package algoPrj.day3;

public class 단야_plain문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0; // 누적합
		
		// 처리
		int jsum=0;
		int i=1; // 반복제어변수
		int j;
		
		final int MAX=5;
		
		while(i<=MAX) {
			j=i-1;
			jsum=jsum+j;
			sum=sum+(jsum+i);
			i++;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
