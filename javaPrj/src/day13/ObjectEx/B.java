package day13.ObjectEx;

public class B {
	int number;
	
	public B() {}
	public B(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return number+"B라구우우";
	}
	
	public boolean equals(B b2) {
		if(this.number == b2.number) {
		}
		return true;
	}
}
