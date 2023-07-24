package algoPrj.day3;

public class 은경_hot문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//각 항에 3씩 곱하는 규칙
		
		int sum=0;
		int n=2;
		int i=1; // 반복제어 변수
		
		while(i<=7) {
			sum+=n; // 항의 누적, sum=sum+n
			n=n*3;
			System.out.print(n+", ");
			i++;
		}
		System.out.println(sum);
	}

}
