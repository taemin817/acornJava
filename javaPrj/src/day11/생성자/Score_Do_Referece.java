package day11.생성자;

// 학생정보를 담을 수 있는 자료형 틀 만들기
// 멤버변수 + 멤버메서드(멤버변수를 사용하는 메서드
// 멤버베서드는 객체가 생성된 이후부터 사용 가능

// type 정의. 변수만들어지는게 아니다!
public class Score_Do_Referece {

	// 멤버변수(인스턴스 변수)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private boolean result;

	// 값의 초기화를 담당하는 특별한 메서드 : 생성자
	// 반환타입 명시하지마
	// 이름이 반드시 클래스명과 동일하도록
	// (new를 통해)객체가 생성될 때 값의 초기화를 담당
	// 생성자를 하나도 만들지 않으면 기본생성자(default)를 제공
	// 생성자를 하나라도 만들면 기본생성자는 제공되지 않음
	public Score_Do_Referece() {

	}

	// 생성자 오버로딩(매개변수로 구분. 즉 매개변수가 반드시 달라야한다)
	// 오버로딩이란 메서드의 이름은 동일하지만 매개변수(개수나 type)가 다른 경우
	// 오버로딩시 반환타입이 다른 것은 오버로딩이 되지 않음
	public Score_Do_Referece(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 초기화 되어있지않음. 어? 위에 초기화되어있네? 불러오자
//	public Score(String name) {
//		this.name = name;
//		this.kor = 60; // 기본점수
//		this.eng = 60; // 기본점수
//		this.math = 60; // 기본점수
//	}

	// 생성자 호출 코드로 변경
	// 생성자끼리 서로 호출 가능.
	// 생성자 호출시 this() 표현으로 호출
	public Score_Do_Referece(String name) {
		this(name, 60, 60, 60); // 반드시 첫줄에 와야함
		this.name = name;
		this.kor = 60; // 기본점수
		this.eng = 60; // 기본점수
		this.math = 60; // 기본점수
	}

	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.math);
		System.out.println(this.result);
	}

	public void calResult() {
		// 80이상이면 합격
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		if (avg >= 80) {
			result = true;
		} else {
			result = false;
		}
	}

	// 현재 객체정보를 문자열로 반환하는 기능 toString
	public String toString() {
		return name + " " + kor + " " + eng + " " + math + " " + result;
	}
}
