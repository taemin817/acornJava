package day10.others;

public class 표준태_핸드폰 {
	private String 제조사;
	private String 기종;
	private String 색;
	private int 용량;

	public void input(String 제조사, String 기종, String 색, int 용량) {
		this.제조사=제조사;
		this.기종=기종;
		this.색=색;
		this.용량=용량;
		
	}
	
	public void printInpo() {
		System.out.println(제조사);
		System.out.println(기종);
		System.out.println(색);
		System.out.println(용량 + "GB");
	}

}
