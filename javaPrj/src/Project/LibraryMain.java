package Project;

import java.io.IOException;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) throws IOException {

		회원가입_class01 sign = new 회원가입_class01();
		도서조회_class List = new 도서조회_class();
		로그인관련_class jt = new 로그인관련_class();
		도서관정보 Info = new 도서관정보();
		
		loop01: while (true) {
			System.out.println("메뉴를 선택하세요\n--------------\n1. 도서리스트 조회\n2. 회원가입\n3. 로그인\n4. 독서실 이용\n5. 도서관 안내\n6. 종료");

			try {
				Scanner sc = new Scanner(System.in);
				String choice = sc.nextLine();
				int choiceNum = Integer.parseInt(choice);
				if(0 < choiceNum && choiceNum <6) {
					switch (choiceNum) {
					case 1:
						// 도서 리스트 구역
						List.조회();
						break;
					case 2:
						// 회원가입 구역
						sign.Join();
						break;
					case 3:
						// 로그인 구역
						jt.로그인스위치();
						break;
					case 4:
						// 독서실 이용하기
					case 5:
						// 도서관 안내
						Info.other();
						break;
					case 6:
						System.out.println("안녕히 가세요");
						break loop01;
					}
				}else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("올바른 메뉴번호를 입력하세요\n");
			}
		}
	}
}
