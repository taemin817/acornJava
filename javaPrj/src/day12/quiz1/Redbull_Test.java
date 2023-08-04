package day12.quiz1;

public class Redbull_Test {

	public static void main(String[] args) {

		Redbull rb = new Redbull();

		rb.액체();
		
		rb.시그니처();
		
		Beverage rb2 = new Redbull(); //
		rb2.액체();
		
		Redbull rb3 = (Redbull)rb2;
		rb3.시그니처();
	}

}
