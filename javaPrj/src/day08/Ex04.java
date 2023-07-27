package day08;

public class Ex04 {

	public static void main(String[] args) {

		int[] result = a();
		
		for(int i=0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println("\n");
		
		int[][] result2 = b();
		
		for(int i=0; i < result2.length; i++) {
			for(int j=0; j < result2[i].length; j++) {
				System.out.print(result2[i][j] + " ");
			}System.out.println();
		}
	}
	
	// 하나의 함수 내에서 return은 한개만 가능하다
	public static int[] a() {
		int[] result = {3, 3};
		return result;
	}
	
	public static int[][] b(){
		int [][] result2 = {{1,2},{3,4}};
		return result2;
	}
}
