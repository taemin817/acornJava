package day13.성적관리;

import java.util.ArrayList;

public class ScoreTest2 {
	public static void main(String[] args) {
	
		// 객체배열
		ArrayList list = new ArrayList();
//		Array[] array = new Array[3];
//		for(int i = 0; i<array.)
		// 학생 등록하기
		Score s1 = new Score("A", 90, 90);	// 삭제됨
		Score s2 = new Score("B", 100, 99);
		
		/* 성적의 결과 구하기 : Score에 calResult 추가해도됨
		s1.calResult();
		s2.calResult();
		*/
		
		list.add(s1);
		list.add(s2);
		list.add(new Score("C", 99, 98));
		
		// 학생 삭제하기
		int index=1;
		list.remove(index-1);		// s1 삭제
		System.out.println("A학생 삭제됨");
		
		// 조회하기
		System.out.println("조회합니다.");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		} 
		
		// Object -> toString()
		// Score -> toString() (override)
		System.out.println("홍길동 추가");
		Object obj  = new Score("홍길동", 100, 100);	// upcasting		
		System.out.println(obj);
						 // obj.toString 생략됨
		// 부모형으로 참조해도 오버라이드된 실제 객체의 메서드가 호출된다
		
		// C학생의 정보 조회
		System.out.println("C정보 조회");
		String searchName = "C";
		for(int i = 0; i < list.size(); i++) {
			Object o = list.get(i);
			String name = ((Score)o).getName();
			
			if(name.equals(searchName)) {
				System.out.println(o.toString());
			}
		}
		
		// B학생의 정보 수정(국어점수를 79으로)
		System.out.println("정보수정 국어 79");
		for(int i =0; i <list.size(); i++) {
			Score score = (Score)list.get(i);
			
			if(score.getName().equals("B")) {
				// 국어점수 변경
				score.setKor(79);
			}
		}
		System.out.println("조회합니다.");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
