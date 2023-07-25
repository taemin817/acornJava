package day6;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열(같은 성질의 변수의 집합. int끼리 char끼리 등)
		
		// 1. 배열 사용해보기  1차원 2차원 3차원
		// 2. 배열 이해하기 -> 기억단계와 처리단계가 다를 때 반드시 필요함.(변수 재탕 안할때. 변수 내용 다 기억해야할 때)
		
		// 변수 5개 선언 -> 메모리 공간을 확보하는 행위
		// int a, b, c, d, e;
		
		// 배열 선언 -> heap 메모리 강제함
		
		// c에서의 배열선언
		// int kors[5];  c만 가능
		// int*arr2 = (int*)malloc(sizeof(int)*5);
		
		int[] kors = new int[5];
		int[] kors2 = {90, 80, 99, 100, 89}; // 배열의 초기화블럭
		
		int a=10, b=4, c=6, d=1, e=22;
		int sum = a + b + c + d + e;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(sum);
		System.out.println();
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 1;
		arr[4] = 22;
		int sum2 = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		
		// 배열의 첨자에 변수 사용 가능 -> 반복문 사용 가능
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(sum2);
		System.out.println();
		
		// 내가 좋아하는 5개를 배열로 만들고 출력하세요
		// 배열선언 ex) char[] arr = new char[5]; ' '
		//			 String[] arr2 = new arr2[3]; " "
		
		String[] team = new String[3];
		team[0] = "맥라렌";
		team[1] = "레드불";
		team[2] = "메르세데스";
		System.out.println(team[0]);
		System.out.println(team[1]);
		System.out.println(team[2]);
		System.out.println();
		for(int i = 0; i < team.length; i++) {
			System.out.println(team[i]);
		}System.out.println();
		
		
		// 김현수 배열
		
		String[] arr2 = new String[5];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = String.format("%d번째 원소", i+1);
			System.out.println(arr2[i]);
		}System.out.println();
		
		String str;
		for(int i=0; i<5; i++) {
			str = (i + 1) + "번째 원소";
			System.out.println(str);
		}
		
		// 조은경 배열
		// 자바 문자표현은 2byte, 한글, 한자 표현 가능
		char[] arr_ch = new char[5];
		arr_ch[0] = '가';
		arr_ch[1] = '나';
		arr_ch[2] = '다';
		arr_ch[3] = '라';
		arr_ch[4] = '마';
		System.out.println("\n---------- 배열(char) ----------");
		for (int i = 0; i < arr_ch.length; i++) {
			System.out.println(arr_ch[i]);
		}System.out.println();
		
		// 김재열 배열
		// 배열은 자료형의 기본값으로 초기화 해준다
		
		String[] beer = { "Kloud", "Cass", "Asahi", "Guiness", "Kelly" };
		for (int i = 0; i < beer.length; i++) {
		System.out.println(beer[i]);
		}

		String[] beer1 = new String[5];
		beer1[0] = "kloud";
		beer1[1] = "Cass";
		beer1[2] = "Asahi";
		beer1[3] = "Guiness";
		beer1[4] = "Kelly";
		System.out.println();
		System.out.println(beer1[0]);
		System.out.println(beer1[1]);
		System.out.println(beer1[2]);
		System.out.println(beer1[3]);
		System.out.println(beer1[4]);
	}

}
