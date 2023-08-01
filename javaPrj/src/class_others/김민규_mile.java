package class_others;

// 데이터 보호(접근제어자 private public 생성자)
public class 김민규_mile {
	
	// 멤버변수
	int mile;
	double kiloMeter;
	
	// 멤버변수를 다루는 기능. 메서드
	public void calCulator(int mile ) {
		this.mile = mile;
		this.kiloMeter = mile*1.60934;
		
	}
	public double getKiloMeter() {
		return kiloMeter;
	}
	
}
