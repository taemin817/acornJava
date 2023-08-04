package day13.ObjectEx;

public class B {
	int number;
	
	public B() {}	// 기본 생성자
	public B(int number) {
		super();	// 자신이 상속받은 부모의 생성자를 호출
		this.number = number;
	}

	@Override
	public String toString() {	// 상속받은 부모의 toString을 override
		return number+"B라구우우";
	}
	
	// 오버라이드 안함
	public boolean equals(B b2) {
		if(this.number == b2.number) {
		}
		return true;
	}
}
