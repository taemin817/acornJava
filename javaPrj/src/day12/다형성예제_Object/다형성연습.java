package day12.다형성예제_Object;

import java.util.ArrayList;

import day03.algo.if문;

public class 다형성연습 {

	public static void main(String[] args) {

		// 다형성 : 같은 자료형에 여러가지 객체를 대입해 다양한 결과를 얻어내는 성질
		
			// car, cat, p, wolf = 참조형 변수
		Car car = new Car();
			      // 인스턴스. 객체
		Cat cat = new Cat();
		Person person = new Person();
		Wolf wolf = new Wolf();
		// 상속을 하나도 받지 않으면 기본적으로 Object를 상속받음
		// 모든 객체는 Object를 상속받아 Object로 다뤄질 수 있다
		
		// 참조형변수 4개를 배열로 변환. 객체가 만들어진 것이 아님
		Object[] arr = new Object[4];
		
		// 업캐스팅 되었다!
		arr[0] = car;
		arr[1] = cat;
		arr[2] = person;
		arr[3] = wolf;
		
		// 반복문
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		
		// 가변길이배열 : 순서와 중복을 허용함
		ArrayList list = new ArrayList();
		list.add(person);
		list.add(cat);
		list.add(car);
		list.add(wolf);
		
		for(Object o : list) {
			System.out.println(o.toString());
			
			if(o instanceof Cat) {
				((Cat)o).쥐를잡는다();
			}
		}
		
		String str = "i like java";
		char result = str.charAt(0);
		boolean result2 = str.equals("i like java");
		
		Object obj = str;	// upcasting
		String str1 = "one";
		String str2 = "two";
		String str3 = "three";
		
		ArrayList strList = new ArrayList();
		strList.add(str1);
		strList.add(str2);
		strList.add(str3);
		
		for(int i = 0; i <strList.size(); i++) {
			Object o = strList.get(i);
			System.out.println(o);
			
			// downcasting하여 원래 써야할 상황이 생겨서!
			if(o instanceof String) {
			String rtn = ((String)o).toUpperCase();
			System.out.println(rtn);
			}
		}
	}

}
