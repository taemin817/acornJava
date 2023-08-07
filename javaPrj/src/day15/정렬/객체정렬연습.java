package day15.정렬;

public class 객체정렬연습 {

	public static void main(String[] args) {

		// 객체참조형변수를 배열로 만든 것. 객체가 생성된 것은 아니다!
		Score[] arr = new Score[3];	// 배열은 모두 null로 초기화
		
		// 객체 생성
		arr[0] = new Score("홍길동", 40, 90);
		arr[1] = new Score("이길동", 80, 70);
		arr[2] = new Score("김길동", 66, 99);
		
		// 정렬 전
		for(Score score : arr) {
			System.out.println(score);	// = score.toString
		}
		System.out.println();
		// 국어점수로 오름차순 정렬 후
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i].getKor()>arr[j].getKor()) {
					Score tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(Score s : arr) {
			System.out.println(s);
		}
		System.out.println();
		
		// 이름으로 오름차순 정렬 후
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i].getName().compareTo(arr[j].getName())>0) {
					// 비교했을 때 기준이 크면(사전상 뒤에 위치) 양수
                    // 비교했을 때 기준이 작으면(사전상 앞에 위치) 음수 반환함  
					Score tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(Score d : arr) {
			System.out.println(d);
		}
		
	}
}
