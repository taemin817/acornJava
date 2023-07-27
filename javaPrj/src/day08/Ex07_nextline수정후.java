package day08;

import java.util.Scanner;

public class Ex07_nextline수정후 {

	public static void main(String[] args) {

		// 일정 관리 프로그램 (일정 : 10개)
		String[] days = new String[10];

		Scanner sc = new Scanner(System.in);
		int menu;
		int index=0;
		loop : while(true) {
			System.out.print("메뉴 선택 : 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료");
			String menu_ = sc.nextLine();
			menu = Integer.parseInt(menu_);
			
			switch (menu) {
			case 1:
				System.out.println("일정을 입력하세요");
				String day = sc.nextLine();
				days[index] = day;
				index++;
				break;
				
			case 2:
				System.out.println("일정을 조회합니다");
				for(int i = 0; i < index; i++) {
					System.out.println((i+1) + ":" + days[i]);
					// 일정의 순번은 1부터니까 0에 +1
				}
				break;
				
			case 3:
				System.out.println("변경");
				
				System.out.println("일정을 조회합니다");
				for(int i = 0; i < index; i++) {
					System.out.println(days[i]);
				}
				
				System.out.println("변경할 순번과 내용을 입력하세요");
				String updateIndex_ = sc.nextLine();
				int updateIndex = Integer.parseInt(updateIndex_);
				
				String updateDay = sc.nextLine();
				days[updateIndex-1] = updateDay;
				// 일정의 순번은 위에서 +1해서 1부터 시작이니까 -1
				break;
				
			case 4:
				System.out.println("삭제");
				
				System.out.println("일정을 조회합니다");
				for(int i = 0; i < index; i++) {
					System.out.println(days[i]);
				}
				
				System.out.println("삭제하고 싶은 일정을 선택하세요");
				String deleteIndex_ = sc.nextLine();
				int deleteIndex = Integer.parseInt(deleteIndex_);
				days[deleteIndex-1] = " ";
				break;
				
			case 5:
				System.out.println("종료");
				break loop;
				
			default:
				System.out.println("잘못된 입력");
			}
		} // while의 끝
		System.out.println("bye");
	} // main의 끝

}
