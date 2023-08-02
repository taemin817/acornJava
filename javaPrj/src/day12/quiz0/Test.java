package day12.quiz0;

public class Test {

	public static void main(String[] args) {

		Human h = new Human();
		Whale w = new Whale();
		h.full();
		System.out.println();
		w.full();
		System.out.println();
		
		// upcasting : 부모의 범위만.
		//사람은 포유류인 m1 -> 포유류 특징만~
		Mammal m1 = new Human();
		m1.젖();
		//고래는 포유류인 m2 -> 포유류 특징만~
		Mammal m2 = new Whale();
		m2.목뼈();
		System.out.println();
		
		// downcasting : 다시 자식으로
		//포유류인 사람 h1 -> 사람 특징~
		Human h1 = (Human)m1;
		h1.뇌();
		//포유류인 고래 w1 -> 고래 특징~
		Whale w1 = (Whale)m2;
		w1.털();
	}

}
