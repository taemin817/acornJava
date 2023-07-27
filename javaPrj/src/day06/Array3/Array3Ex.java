package day06.Array3;

public class Array3Ex {

	public static void main(String[] args) {
							
		int [][] odd2 = new int[3][3];  // 홀수만  1  3  5
									    //	     7  9 11
									    //	    13 15 17
		int v = 1;
		for(int i = 0; i < odd2.length; i++) {
			for(int j = 0; j < odd2[i].length; j++) {
				odd2[i][j] = v;
				v+=2;
				System.out.print(odd2[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
		int [][] even = {
				{2, 4, 6},
				{8, 10, 12},
				{14, 16, 18}
				};
		int [][] odd1 = {
				{1, 3, 5},
				{7, 9, 11},
				{13, 15, 17}
				};
		
		for(int i = 0; i < even.length; i++) {
			for(int j = 0; j < even[i].length; j++) {
				System.out.print(even[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
		for(int i = 0; i < odd1.length; i++) {
			for(int j = 0; j < odd1[i].length; j++) {
				System.out.print(odd1[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
		
	}

}
