package Project;

import java.util.Scanner;

public class 실습과제3번2 {

		 static String[] days = new String[100];
		 static int index=0;		
		 static Scanner sc = new Scanner( System.in);

		public static void main(String[] args) {	

			//일정을 관리하는 프로그램 작성( 일정10개 )		 
			int menu;
			loop: while(true) {
				 System.out.print("메뉴선택: 1.등록, 2조회, 3.변경, 4.삭제, 5.종료 ");	//		 
				 String menu_ = sc.nextLine();
				 menu=Integer.parseInt(menu_);				 
				 switch(menu) {
				 case 1:
					 insertDay();
					 break;
				 case  2:
					 selectDays();		  
					 break;
				 case  3:
					 updateDay();					 			 
					 break;
				 case 4:				 
					 deleteDay(); 
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

		
		public static void insertDay( ) {
			 System.out.println("일정을 입력하세요");	
			 String day = sc.nextLine();
			 days[index] = day;
			 index++;
		}
		
		public static void selectDays( ) {
			System.out.println( "일정을 조회합니다. ");
			 for(int i=0; i<index; i++) {
				 if(days[i]!=null) {
					 System.out.println((i+1) +":" + days[i]);
				 }
				 //  1: 놀러가기
				 //  2: 산책하기
			 }
		}
		
		public static void updateDay() {
			System.out.println("변경할 리스트");				 
			 selectDays( );					 
			 System.out.println("변경할 순번을 입력하세요");				    
			 String updateIndex_= sc.nextLine();
			 int updateIndex = Integer.parseInt(updateIndex_); //순번
			 System.out.println("변경할 내용을 입력하세요");
			 String updateDay = sc.nextLine();				 //내용
			 days[updateIndex-1] = updateDay;				//업데이트
		}
		
		public static void deleteDay() {
			System.out.println("삭제");				 
			 selectDays( );					 
			 System.out.println("삭제하고 싶은 일정을 선택하세요");
			 String deleteIndex_ = sc.nextLine();  // "2" => 2
			 int deleteIndex = Integer.parseInt(deleteIndex_); // 삭제하고 싶은 일정의 순번 

			 for(int i = deleteIndex-1; i<index; i++) {	
				days[i] = days[i+1];
			 }
		}

}