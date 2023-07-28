package day09.func;

import java.util.Arrays;

public class arrCopy {

	public static void main(String[] args) {

		int[] arr = new int[] {1, 3, 5};
	  // = int[] arr = {1, 3, 5};
		
		int[] newArr = new int[3];
		// 배열 복사
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}

}
