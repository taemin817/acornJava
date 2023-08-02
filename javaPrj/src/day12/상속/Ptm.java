package day12.상속;

public class Ptm extends Who{
	
	String address;
	
	public Ptm(String name, int birth, String gender, String address) {
		//super(); 부모의 기본생성자를 호출
		super(name, birth, gender);
		this.address = address;		// this : 자기자신의 인스턴스 멤버나 생성자를 호출하는 키워드
	}
	
	public String toString() {
		
		return name+" "+birth+" "+gender+" "+address;
		
	}
	
}
