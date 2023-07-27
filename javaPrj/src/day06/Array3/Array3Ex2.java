package day06.Array3;

public class Array3Ex2 {

	public static void main(String[] args) {
		
		int [][] even = {
				{2, 4, 6},
				{8, 10, 12},
				{14, 16, 18}
				};
		
		int [][] odd = {
				{1, 3, 5},
				{7, 9, 11},
				{13, 15, 17}
				};
		
		int [][][] dimension3 = {
					{
						{2, 4, 6},
						{8, 10, 12},
						{14, 16, 18}
					},
					{
						{1, 3, 5},
						{7, 9, 11},
						{13, 15, 17}
					}
			};
		System.out.println(dimension3[1][2][2]); // 17
		System.out.println(dimension3[0][2][0]); // 14
		System.out.println();
		
		// 3차원 배열 for문 출력
		for(int i = 0; i < dimension3.length; i++) {				// 면
			for(int j = 0; j < dimension3[i].length; j++) {			// 행
				for(int k=0; k < dimension3[i][j].length; k++) {	// 열
				System.out.print(dimension3[i][j][k] + " ");		// 출력
				}System.out.println();
			}
		}
		
		int [][][][] sudoku = {
				{
					{
						{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
					},
					{
						{4, 5, 6},
						{7, 8, 9},
						{1, 2, 3}
					},
					{
						{7, 8, 9},
						{1, 2, 3},
						{4, 5, 6}
					}
				},
				{
					{
						{2, 3, 4},
						{5, 6, 7},
						{8, 9, 1}
					},
					{
						{5, 6, 7},
						{8, 9, 1},
						{2, 3, 4}
					},
					{
						{8, 9, 1},
						{2, 3, 4},
						{5, 6, 7}
					}
				},
				{
					{
						{3, 4, 5},
						{6, 7, 8},
						{9, 1, 2}
					},
					{
						{6, 7, 8},
						{9, 1, 2},
						{3, 4, 5}
					},
					{
						{9, 1, 2},
						{3, 4, 5},
						{6, 7, 8}
					}
				}
		};
		
		System.out.println();
		for(int i = 0; i < sudoku.length; i++) {						// 면
			for(int j = 0; j < sudoku[i].length; j++) {					// 행
				for(int k = 0; k < sudoku[i][j].length; k++) {			// 열
					for(int l = 0; l < sudoku[i][j][k].length; l++) {	// 점
						System.out.print(sudoku[i][j][k][l] + " ");		// 출력
					}System.out.print("  ");
				}System.out.println();
			}System.out.println();
		}
	}

}
