package day11.생성자;

public class MovieClass2 {

	private String title;	// 클래스형의 기본값 null
	private String genre;
	private String runningtime;
	private String rating;
	
	// 생성자 : 매개변수가 있음
	// 생성자 규칙 : 반드시 클래스명과 동일하게, 반환타입을 명시하지 말것
	// 생성자는 만들지않으면 기본생성자(default 생성자 : 매개변수, 기능없음)를 하나 제공
	// 프로그래머가 생성자를 하나라도 만들면 기본생성자는 제공중단
	
	public MovieClass2(String title, String genre, String runningtime, String rating) {
		this.title=title;
		this.genre=genre;
		this.runningtime=runningtime;
		this.rating=rating;
	}
	
	public MovieClass2() {
	}
	
	public void printInfo() {
		System.out.println("제목:"+title);
		System.out.println("장르:"+genre);
		System.out.println("상영시간:"+runningtime);
		System.out.println("관람가:"+rating+"\n");
		
	}
	
}
