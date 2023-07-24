package day5;

import java.util.Scanner;

public class answer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 고객정보(아이디 이름 나이 키) 입력받아 출력
		String id;
		String name;
		int age;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		id = sc.next();
		name = sc.next();
		age = sc.nextInt();
		height = sc.nextDouble();
		
		System.out.println(id + " " + name + " " + age + " " + height);
		
		sc.close();
		
	}

}
