package algo.day3;

public class 민규_hot문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double ha = 2500000;
		double ka = 1800000;
		
		final double ALPHA = 1.036;
		final double BETA = 1.042;
		
		int y=1999;
		
		while (ha > ka) {
			y++;
			ha=ha*ALPHA;
			ka=ka*BETA;
			System.out.println(y);
		}
		System.out.println(y);
	}

}
