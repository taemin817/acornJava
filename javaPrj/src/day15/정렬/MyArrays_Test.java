package day15.정렬;

public class MyArrays_Test {

	public static void main(String[] args) {

		Score[] arr = new Score[3];

		arr[0] = new Score("홍길동", 40, 90);
		arr[1] = new Score("이길동", 80, 70);
		arr[2] = new Score("김길동", 66, 99);

		// MyArrays.sort(배열, MyComparator 인터페이스)
		MyComparator_imp m = new MyComparator_imp();
		MyArrays.sort(arr, m);

		System.out.println("정렬 후");
		for (Score score : arr) {
			System.out.println(score);
		}

		// 익명클래스 작성하여 객체 생성
		MyArrays.sort(arr, new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {

				Score s1 = (Score) o1;
				Score s2 = (Score) o2;

				return s1.getEng() - s2.getEng(); // 기준의 영어점수가 크면 양수 반환, 작으면 음수 반환
			}
		});
		System.out.println();
		System.out.println("영어점수 정렬 후");
		for (Score score : arr) {
			System.out.println(score);
		}

		// 익명클래스 작성하여 객체 생성
		MyArrays.sort(arr, new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {

				Score s1 = (Score) o1;
				Score s2 = (Score) o2;

				return s1.getKor() - s2.getKor(); // 기준의 영어점수가 크면 양수 반환, 작으면 음수 반환
			}
		});
		System.out.println();
		System.out.println("국어점수 정렬 후");
		for (Score score : arr) {
			System.out.println(score);
		}
		
		
		// 익명클래스 작성하여 객체 생성
				MyArrays.sort(arr, new MyComparator() {

					@Override
					public int compare(Object o1, Object o2) {

						Score s1 = (Score) o1;
						Score s2 = (Score) o2;

						return s1.getName().compareTo(s2.getName()); // 기준의 영어점수가 크면 양수 반환, 작으면 음수 반환
					}
				});
				System.out.println();
				System.out.println("이름 정렬 후");
				for (Score score : arr) {
					System.out.println(score);
				}
	}

}
