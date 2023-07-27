package day03.algo;

public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 분기문  if, switch
		
		/*
		 if문 형식
		 if(조건식){실행할 내용}
		 if(조건식){실행할 내용}else{}
		 if(조건식){실행할 내용}else if(조건식){}else if(조건식){}
		 if(조건식){실행할 내용}else if(조건식){}else if(조건식){}else{}
		 */
		
		int score = 90;
		if(score>=90) {
			System.out.println("학점은 A");
		}else if(score>=80) {
			System.out.println("학점은 B");
		}
		////////////잘못된 용례/////////////
		if(score>=90) {
			System.out.println("학점은 A");
		}
		if(score>=80) {
			System.out.println("학점은 B");
		}
		/////////////////////////////////
		
	}

}
