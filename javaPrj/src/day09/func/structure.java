package day09.func;

import java.util.Scanner;

public class structure {
	static String[] days = new String[10];
	static Scanner sc = new Scanner( System.in);
	static int index=0;			

	public static void main(String[] args) {		 
		
		//일정을 관리하는 프로그램 작성 (일정10개)
		int menu; 		 
		loop: while(true) {
			 System.out.print("메뉴선택:  1.등록 , 2조회, 3.변경, 4.삭제 , 5.종료 ");
			 
			 String menu_ = sc.nextLine();
			 menu = Integer.parseInt(menu_);	
			 
			 switch( menu) {
			 case 1:
				 insert();
				 break;
			 case  2:
				 select();				  
				 break;
			 case  3:
				 update();				 
				 break;
			 case 4:				 
				 delete(); 
				 break;
			 case 5:
				 System.out.println("종료");
				 break loop;	
			 default:
				 System.out.println("잘못된 입력");			 
			 }		 
			
		} // while
		System.out.println("bye");
	} //main  종료
	
	
	public static void insert() {
		System.out.println("일정을 입력하세요");	
		 String day = sc.nextLine();
		 days[index] = day;
		 index++;
	}
	
	public static void select() {
		System.out.println("일정을 조회합니다");
		 for(int i=0; i< index; i++) {
			 System.out.println((i+1) +"." + days[i]);
		 }
	}
	
	public static void update() {
		System.out.println("변경");
		 
		 select();	
		 
		 System.out.println("변경할 순번과 내용을 입력하세요");				 
		 String updateIndex_= sc.nextLine();
		 int updateIndex = Integer.parseInt(updateIndex_);				 
		 
		 String updateDay = sc.nextLine();				 
		 days[updateIndex-1] =  updateDay;
	}
	
	public static void delete() {
		System.out.println("삭제");				 
		 select();					 
		 System.out.println("삭제하고 싶은 일정을 선택하세요");
		 String deleteIndex_ = sc.nextLine();
		 int deleteIndex = Integer.parseInt(deleteIndex_);  // "2" => 2
		 days[deleteIndex-1]="";
	}

}
