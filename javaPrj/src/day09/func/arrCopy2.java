package day09.func;

import java.util.Arrays;

public class arrCopy2 {

	public static void main(String[] args) {
		
		// 원본
		int[] arr = new int[] {1, 2, 4};
		
		// 새 배열
		int[] newArr = new int[3];
		// 배열 복사	  // 원본배열명,  시작위치, 붙여넣을배열명 , 시작위치, 배열크기(arr.length로도 가
		System.arraycopy(arr	, 0		, newArr	, 0		, 3);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}

}
