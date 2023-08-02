package day11.quiz;

public class Pencil_Test {

	public static void main(String[] args) {

		Red red = new Red();
		Pencil pencil = new Red();	// 업캐스팅
		Red red2 = (Red)pencil; // 다운캐스팅
		
		Blue blue = new Blue();

		Yellow yellow = new Yellow();
		
		Green green = new Green();
		
		red.빨강();
		red2.빨강();	// 다운캐스팅
		
		color(green);	// 오버라이딩
		color(blue);	// 오버라이딩
		
		kind(blue);
		func(yellow);
	}
	
	public static void color(Pencil color) {
		color.색();
	}
	public static void kind(Blue blue) {
		blue.종류();
	}
	public static void func(Yellow yellow) {
		yellow.기능();
	}
}
