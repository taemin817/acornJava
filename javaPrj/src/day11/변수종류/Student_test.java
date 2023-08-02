package day11.변수종류;

public class Student_test {

	public static void main(String[] args) {

		
		// 참조형 변수로 다룬다
		// 1. new를 통해 공간을 확보
		// 2. 생성자에 의해 공간의 값이 초기화
		// 3. 생성된 객체 정보를 참조형 변수가 저장
		// 4. 참조형변수를 통해 객체의 정보를 저장하거나 이용
		// 5. 객체지향은 메서드를 통해 값을 사용하는 방법을 이용
												// "우주연" 이 하나만 있어도 되겠는데? -> static으로 끌어내자(Student2 참고)
		Student s1 = new Student("박태민", 95, 98, "우주연"); // new 대상 = 
		Student s2 = new Student("김민지", 100, 89, "우주연");
		Student s3 = new Student("서예진", 99, 88, "우주연");
		Student s4 = new Student("문나정", 91, 96, "우주연");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		String result3 = s3.toString();
		String result4 = s4.toString();
		
		System.out.println(result3);
		System.out.println(result4);

	}

}
