package day11.생성자;

public class 박태민_james {

	public static void main(String[] args) {
		
		System.out.println("나이 이름 성별 결혼여부 자식수");
		
		박태민_james_class manInfo = new 박태민_james_class(20, "james", "male", true, 3);
		
		String result = manInfo.toString();
		
		System.out.println(result);
		System.out.println();
		//기본생성자가 있어야 가능
		박태민_james_class a = new 박태민_james_class();
		String result2 = a.toString();
		System.out.println(result2);
	}

}
