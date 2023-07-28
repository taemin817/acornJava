package day09.func;

public class callByReference2 {

	public static void main(String[] args) {

		int[] kors = new int[3];
		// 등록
		what(kors);
		// 조회
		the(kors);
	}
	public static void what(int[] kors) {
		int j = 1;
		for(int i = 0; i < kors.length; i++) {
			kors[i]=j++;
		}
	}
	public static void the(int[] kors) {
		for(int i = 0; i < kors.length; i++) {
			System.out.println(kors[i]);
		}
	}

	
}
