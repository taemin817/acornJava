package day14.Exception;


// Exception -> 필수예외
public class NegativeNumberException1 extends Exception {

	public NegativeNumberException1() {
		super("음수이면 안된다");
	}

}
