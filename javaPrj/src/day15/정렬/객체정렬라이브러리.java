package day15.정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 객체정렬라이브러리 {

	public static void main(String[] args) {

		Score[] arr = new Score[3];

		arr[0] = new Score("홍길동", 40, 90);
		arr[1] = new Score("이길동", 80, 70);
		arr[2] = new Score("김길동", 66, 99);

//		Arrays.sort(arr); 오류발생
		Arrays.sort(arr, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score s1 = (Score) o1;
				Score s2 = (Score) o2;

				return s1.getEng() - s2.getEng();
			}});
		for(Score s : arr)
			System.out.println(s);		
		System.out.println();
		
		System.out.println("국어점수를 제네릭으로");
		Arrays.sort(arr, new Comparator<Score>() {
			
			@Override
			public int compare(Score o1, Score o2) {
				// TODO Auto-generated method stub
				return o1.getKor() - o2.getKor();
			}});
		for(Score s : arr)
			System.out.println(s);
		System.out.println();
		
		// 배열의 요소인 객체가 Comparable 인터페이스를 구현해야한다.
//		Arrays.sort(arr);
		System.out.println("영어점수를 제네릭으로");
		Arrays.sort(arr, new Comparator<Score>() {
			
			@Override
			public int compare(Score o1, Score o2) {
				// TODO Auto-generated method stub
				return o1.getEng() - o2.getEng();
			}});
		
		for(Score s : arr) {
			System.out.println(s);
		}
	}

}
