package class_others;

import java.util.Scanner;

public class 김민규_mile_test {

	public static void main(String[] args) {

		
		System.out.println("마일을 입력하세요 자동으로 km로 변환됩니다.");
		Scanner sc = new Scanner(System.in);
		
		int mile = sc.nextInt();
		김민규_mile ab = null;
		ab = new 김민규_mile();
		
		ab.calCulator(mile);
		double result = ab.getKiloMeter();
		System.out.println(result);
		
	
		System.out.println(ab.kiloMeter + "km");
	
	
		
	}

	
}
