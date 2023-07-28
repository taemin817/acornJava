package day09.func;

public class arrDelete {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		// 삭제할 index : 2 -> 3을 삭제
		int index=2;
		// arr 배열보다 크기가 1 작은 배열 생성
		int[] newArr = new int[arr.length-1];
		
		//	arr 배열에서 index->2 전까지의 배열
		for(int i = 0; i < index; i++) {
			newArr[i] = arr[i];	// arr 배열에서 0, 1번째 배열 -> newArr
		}
		//	arr 배열에서 index->2 이후의 배열
		for(int i = index; i < newArr.length; i++) {
			newArr[i] = arr[i+1];	// arr 배열에서 3, 4번째 배열 -> newArr
		}
	}

}
