package day12.상속;

public class 상속_Test {

	public static void main(String[] args) {

		//Person person = new Person();
		
		Person p = new Person("박태민", "tmp");
		Student s = new Student("김민규", "mkk", 1);
		
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
	

}
