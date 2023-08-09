package day16.hs;

import java.util.Scanner;

public class UserManage {

	public static void main(String[] args) {

		UserHandler handler = new UserHandler(3);

		loop: while (true) {
			System.out.println("---메뉴선택---");
			System.out.println("1. 회원가입");
			System.out.println("2. 프로그램 종료");

			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				handler.userInsert();
				break;
			case 2:
				System.out.println("프로그램 종료");
				break loop;
			}
		}
	}

}
