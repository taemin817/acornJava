package day13.test;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private char grade;

	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calGrade();
	}
	
	public void calGrade() {
		int sum = kor+eng;
		int avg = sum/2;
		if(avg>=90)
			grade='A';
		else if(avg>=80)
			grade='B';
		else if(avg>=70)
			grade='C';
		else grade='F';
	}
	
	public Score() {		// 기본생성자
		
	}
	
	@Override
	public String toString() {
		return  name + " " + kor + " " + eng + " " + grade + "\n";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public char getResult() {
		return grade;
	}

	public void setResult(char grade) {
		this.grade = grade;
	}

}
