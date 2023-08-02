package day12.상속;

public class Man_test {

	public static void main(String[] args) {
		
		Who who = new Who("박용곤", 570714, "남");
		
		Ptm ptm = new Ptm("박태민", 920817, "남", "서울시 영등포구");
		
		System.out.println(who.toString());
		System.out.println(ptm.toString());

	}

}
