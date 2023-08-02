package day12.상속;

public class Person {

	// 멤버변수/인스턴스변수 : new를 통해 변수 생성, 객체라고 부른다
	String name;
	String id;
	
	// 생성자, 객체의 초기화담당. 기본생성자를 기본으로 제공
	// 생성자를 하나라도 만들면 기본생성자는 만들어지지 않음
	// new 할 때 단 한번 호출. 생성자끼리 호출가능하지만 첫줄에 와야함
	
	public Person() {
		
	}
	
	public Person(String name, String id) {
		this.name = name;		// this : 자기자신의 인스턴스 멤버나 생성자를 호출하는 키워드
		this.id = id;
	}
}
