package day7;

public class 배열정렬 {

	public static void main(String[] args) {
		
		int arr[] = {8, 3, 7, 11, 9};
		
		// 배열에서 가장 큰 수 출력
		int MAX = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]>MAX) {
				MAX = arr[i];
			}
		}System.out.println(MAX);

		// 배열에서 가장 작은 수 출력
		int MIN = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<MIN) {
				MIN = arr[i];
			}
		}System.out.println(MIN);
	}

}
