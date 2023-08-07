package day15.정렬;

public class 객체정렬라이브러리직접 {

	public static void main(String[] args) {

		Score[] arr = new Score[3];

		arr[0] = new Score("홍길동", 40, 90);
		arr[1] = new Score("이길동", 80, 70);
		arr[2] = new Score("김길동", 66, 99);
		
		MyArrays.sort(arr);
		for(Score s:arr)
			System.out.println(s);
	}

}
