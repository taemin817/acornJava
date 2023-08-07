package day15.정렬;

import java.util.Arrays;

public class 정렬연습 {

	public static void main(String[] args) {

		int[] arr = {95, 75, 85, 100, 50};
		
		// selection sort(선택정렬)
			// i : 기준, 0번재부터 length-1까지 기준(마지막은 비교할 수가 없으니..)
		for(int i = 0; i<arr.length-1;i++) {
				// j : 비교대상, 1번째부터 length까지 비교
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("배열 정렬 후");
		String result=Arrays.toString(arr);
		System.out.println(result);
	} 

}
