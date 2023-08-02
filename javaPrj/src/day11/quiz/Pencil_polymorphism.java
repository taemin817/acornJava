package day11.quiz;

public class Pencil_polymorphism {

	public static void main(String[] args) {
		
		Red r = new Red();
		r.빨강();
		r.기능();
		r.색();
		r.종류();
		System.out.println();
		
		Blue b = new Blue();
		b.파랑();
		b.기능();
		b.색();
		b.종류();
		System.out.println();
		
		Yellow y = new Yellow();
		y.노랑();
		y.기능();
		y.색();
		y.종류();
		System.out.println();
		
		Green g = new Green();
		g.초록();
		g.기능();
		g.색();
		g.종류();
	}
}
