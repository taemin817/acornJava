package day14.Exception;

public class Ex02 {

	public static void main(String[] args) {
		
		// 예외처리 : 예외발생시 대비코드를 작성하는 것
		// 필수(checked) : 
		// 선택(unchecked) : 배열범위 벗어났을 때, 0으로 나누는 것.
		// try{} catch{}
		
		try {
			// 예외가 발생하면 예외객체가 생성됨
		int[] arr = new int[3];
		
		arr[3] = 50;
		System.out.println(arr[3]);
		
		}catch (Exception e) {
//		}catch (ArrayIndexOutOfBoundsException e) {
			// 예외가 발생했을 때 실행할 코드
		}
		System.out.println("정상종료");
	}
}
