package day6;

public class Array2Ex {

	public static void main(String[] args) {

		// 내가 좋아하는 과일 5개
		// 내가 좋아하는 음료 5개
		
		String[] fruits = {"바나나", "멜론", "복숭아"	, "자두", "무화과"};
		String[] beverage = {"환타오렌지", "닥터페퍼", "스프라이트", "아침햇살", "토마토주스"};
		
		// 2차원 배열
		
		// 2차원 배열 선언  [행][열]
		// String[][] likey = new String[2][5];
		
		String[][] likey = {{"바나나", "멜론", "복숭아", "자두", "무화과"},
							{"환타오렌지", "닥터페퍼", "스프라이트", "아침햇살", "토마토주스"}};
		System.out.println(likey[0][0]);
		System.out.println(likey[0][1]);
		System.out.println(likey[0][2]);
		System.out.println(likey[0][3]);
		System.out.println(likey[0][4]);
		System.out.println(likey[1][0]);
		System.out.println(likey[1][1]);
		System.out.println(likey[1][2]);
		System.out.println(likey[1][3]);
		System.out.println(likey[1][4]);
		System.out.println();
		
		String[][] comics = {{"데스노트", "20세기소년", "몬스터", "블리치", "나루토"},
				{"아따맘마", "명탐정코난", "주술회전", "건담", "헌터헌터"}};
		
		for(int i = 0; i < comics.length; i++) {
			for(int j = 0; j < comics[i].length; j++) {
				System.out.println(comics[i][j]);
			}
		}System.out.println();
		
		
		// 김병진 2차원 배열
		String[][] favorites = { { "애플망고", "망고", "블랙사파이어", "블루베리", "체리" },
				{ "아아", "고구마라때", "피스타치오프라페", "아바라", "망고블랜더" }, };
		
				System.out.println("2차원 배열 출력");
				for (int i = 0; i < 2; i++) {
					if (i == 0) {
						System.out.print("과일 = ");
					}
					if (i == 1) {
						System.out.print("음료 = ");
					}
					for (int j = 0; j < 5; j++) {
						System.out.printf(" %s ", favorites[i][j]);
					}
					System.out.println();
				}
				System.out.println();
				
		// 조은경 3차원 배열
			String[][][] language = { {{ "a", "b", "c", "c", "e" }, { "A", "B", "C", "D",  "E"}},
					  {{ "ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ" }, { "가", "나", "다", "라",  "마"}}}; 

			System.out.print(language[0][0][0] + " ");
			System.out.print(language[0][0][1] + " ");
			System.out.print(language[0][0][2] + " ");
			System.out.print(language[0][0][3] + " ");
			System.out.println(language[0][0][4]);
			
			System.out.print(language[0][1][0] + " ");
			System.out.print(language[0][1][1] + " ");
			System.out.print(language[0][1][2] + " ");
			System.out.print(language[0][1][3] + " ");
			System.out.println(language[0][1][4]);
			
			System.out.print(language[1][0][0] + " ");
			System.out.print(language[1][0][1] + " ");
			System.out.print(language[1][0][2] + " ");
			System.out.print(language[1][0][3] + " ");
			System.out.println(language[1][0][4]);
			
			System.out.print(language[1][1][0] + " ");
			System.out.print(language[1][1][1] + " ");
			System.out.print(language[1][1][2] + " ");
			System.out.print(language[1][1][3] + " ");
			System.out.println(language[1][1][4]);
			System.out.println();
			
	}
}

