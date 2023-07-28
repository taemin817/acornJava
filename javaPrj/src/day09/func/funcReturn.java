package day09.func;

public class funcReturn {

	public static void main(String[] args) {

		int[] arr = new int[] {1, 2, 5};
		printArray(arr);

	}
	public static void printArray(int[] i) {
		for(int number : i) {
			System.out.print(number + " ");
		}
	// = for(int i = 0; i < arr.length; i++){
	//		System.out.print(a[i]);
	//		}
	}
}
