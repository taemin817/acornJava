package day10.classType;

public class customerTest {

	public static void main(String[] args) {

		int a;
		a = 10;
		
		customerInfo cs = new customerInfo(); // new를 통해 변수 생성
							// 참조형 변수. 변수가 있는 위치, 레퍼런스를 저장
							// 초기값 =  null;
		/* 원래 위의 한 줄은 다음 두줄과 같다
		 customerInfo cs = null;
		 cs = new csutomerInfo();
		*/
								
		cs.id = "tmpark11";
		cs.pw = "qwer";
		cs.name = "taemin";
		cs.address = "seoul";
		
		System.out.println(cs.id);
		System.out.println(cs.pw);
		System.out.println(cs.name);
		System.out.println(cs.address);
		

	}

}
