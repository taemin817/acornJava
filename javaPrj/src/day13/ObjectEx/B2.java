package day13.ObjectEx;

public class B2 {
	int number;
	
	public B2() {}
	public B2(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return number+"B라구우우";
	}
	 
	@Override
	public boolean equals(Object obj) {
		boolean result = false;		// 초기화
		B2 b = (B2)obj;
		if(this.number == b.number)
			result = true;
		return true;
	}
}
