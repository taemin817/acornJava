package day08;

public class Ex01 {

	public static void main(String[] args) {

		extracted();	// 함수호출
	}
			  // 반환타입, 함수명()
	public static void extracted() {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
