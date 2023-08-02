package day12.quiz0;

public class Human extends Mammal{

	@Override
	public void 털() {
		System.out.println("거의 없다");
	}
	// 사람의 특징
	public void 뇌() {
		System.out.println("무겁다!");
	}
	
	@Override
	public void full() {
	   super.full();
	   뇌();
	}
	
}
