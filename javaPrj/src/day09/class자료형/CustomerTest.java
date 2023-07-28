package day09.class자료형;

public class CustomerTest {

	public static void main(String[] args) {
		
	// 자료형 변수이름;
		int a;
		
	//  배열, 객체는 메모리에 공간을 확보하는 행위를 할 때는 new로 heap 메모리 사용이 강제됨
	//  Customer c; 메모리 공간 만들어진게 아님
		Customer c = new Customer();
		c.name = "홍길동";
		c.id = "devil";
		c.age = 20;
		
		System.out.println(c.name);
		System.out.println(c.id);
		System.out.println(c.age);

	}

}
