package day08;

import java.util.Scanner;

public class Ex08 {

	// 일정 관리 프로그램 (일정 : 10개)
	static String[] days = new String[10];
	static int index=0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int menu;
		loop : while(true) {
			System.out.print("메뉴 선택 : 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료");
			String menu_ = sc.nextLine();
			menu = Integer.parseInt(menu_);
			
			switch (menu) {
			case 1:
				insertDay();	// 일정 입력 함수
				break;
				
			case 2:
				selectDays();	// 일정 조회 함수
				break;
				
			case 3:
				updateDay();	// 일정 변경 함수
				break;
				
			case 4:
				deleteDay();	// 일정 삭제 함수
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
	
	// 함수 내용 부분
	public static void insertDay() {
		System.out.println("일정을 입력하세요");
		String day = sc.nextLine();
		days[index] = day;
		index++;
	}

	public static void selectDays() {
		System.out.println("일정을 조회합니다");
		for(int i = 0; i < index; i++) {
			System.out.println((i+1) + ". " + days[i]);
			// 일정의 순번은 1부터니까 0에 +1
		}
	}
	
	public static void updateDay() {
		System.out.println("변경");
		
		selectDays();
		
		System.out.println("변경할 순번과 내용을 입력하세요");
		String updateIndex_ = sc.nextLine();
		int updateIndex = Integer.parseInt(updateIndex_);
		
		String updateDay = sc.nextLine();
		days[updateIndex-1] = updateDay;
		// 일정의 순번은 위에서 +1해서 1부터 시작이니까 -1
	}
	
	public static void deleteDay() {
		System.out.println("삭제");
		
		selectDays();
		
		System.out.println("삭제하고 싶은 일정을 선택하세요");
		String deleteIndex_ = sc.nextLine();
		int deleteIndex = Integer.parseInt(deleteIndex_);
		days[deleteIndex-1] = " ";
	}

}
