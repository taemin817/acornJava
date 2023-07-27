package day05;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue : 반복문에서 다음 반복으로 바로 진행할 수 있도록 하는 명령
		// 1~10 홀수의 합 구하기
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) // i가 짝수이면
				continue; // 다음 반복  수행할 문장이 한 줄이면 {}생략
			sum+=i;
			System.out.println(sum);
		}System.out.println("합 : " + sum);
		
	}

}
