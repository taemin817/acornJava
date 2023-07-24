package algo.day3;

public class 재열_hot문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double hp= 250_0000;
		double kp= 180_0000;
		double hr= 0.036;
		double kr= 0.042;
		int y=1999;
		while(true) {
			y=y+1;
			hp=hp*(1+hr);
			kp=kp*(1+kr);
			
			if(kp>hp)break;
		}
		System.out.println(y);
	}

}
