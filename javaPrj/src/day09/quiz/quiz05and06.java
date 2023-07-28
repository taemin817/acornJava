package day09.quiz;

import java.util.Scanner;

public class quiz05and06 {

	public static void main(String[] args) {
		
		String[][] schedule = new String[5][5];
		Scanner sc = new Scanner(System.in);
		int j = 0;
		int k = 0;
		final int MAX = 5;
		
		while(true) {
			System.out.println("원하는 번호를 선택하세요 1.등록, 2.조회, 3.변경 4.삭제");
			
			String menuNum = sc.nextLine();
			int num = Integer.parseInt(menuNum);
			switch (num) {
			case 1:
				System.out.println("등록할 "+(j+1)+"일차를 입력하고 일정을 등록하세요");
				String schdDay1 = sc.nextLine();
				int schdlday1 = Integer.parseInt(schdDay1);
				j = schdlday1-1;
				if(j==0) {
					while(k<MAX){
						String schdCon1 = sc.nextLine();
						schedule[j][k] = schdCon1;
						k++;}
					j++;k=0;
					}
				else if(j==1){
					while(k<MAX){
						String schdCon1 = sc.nextLine();
						schedule[j][k] = schdCon1;
						k++;}
					j++;k=0;
					}
				break;
				case 2:
					for(int i = 0; i < schedule.length; i++) {
						for(int a = 0; a < schedule[a].length; a++) {
							System.out.println(schedule[i][a]);
						}
					}
			default:
				break;
			}
		}

	}

}
