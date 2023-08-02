package day12.상속;

public class Who {

	String name;
	int birth;
	String gender;
	
	public Who(String name, int birth, String gender) {
		this.name = name;		// this : 자기자신의 인스턴스 멤버나 생성자를 호출하는 키워드
		this.birth = birth;
		this.gender = gender;
	}
}
