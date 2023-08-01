package day11.변수종류;

// 학생 한 명이 가져야할 정보를 표현하기 위한 자료형
public class Student2 {
	// 인스턴스 변수(new로 만들때마다 생성)
	String name;
	int kor;
	int eng;
	double avg;
	static String teacher = "우주연"; // static/클래스 변수 : 클래스 안에서 하나만 만들어짐
						   // 클래스 안에서 공통적으로 사용하는 값을 저장하기 위한 변수
						   // 프로그램을 시작할 때 만들어지고 종료할 때 소멸

	// 기본생성자
	public Student2() {

	}

	// 배개변수가 있는 생성자
	public Student2(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.avg = (kor+eng)/2;
	}

	public String toString() {
		return name + " " + kor + " " + eng + " " + avg + " " + teacher;
	}
}