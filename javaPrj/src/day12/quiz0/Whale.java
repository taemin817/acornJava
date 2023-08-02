package day12.quiz0;

public class Whale extends Mammal{

	@Override
	public void 털() {
		System.out.println("거의 없다");
	}
	// 고래의 특징
	public void 뇌() {
		System.out.println("작다!");
	}
	
	@Override
	public void full() {
		super.full();
		뇌();
	}
}
