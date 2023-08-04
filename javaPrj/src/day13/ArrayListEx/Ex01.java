package day13.ArrayListEx;

import java.util.ArrayList;

import day13.성적관리.Score;

public class Ex01 {

	public static void main(String[] args) {
				// generic
		ArrayList<Score> list = new ArrayList<>();
		
		Score s1 = new Score("A", 90, 90);
		Score s2 = new Score("B", 100, 99);
		
		System.out.println("등록하기");
		list.add(s1);
		list.add(s2);
		list.add(new Score("C", 99, 98));
		
		System.out.println();
		
		System.out.println("조회하기");
		for(int i = 0; i < list.size(); i++) {
			Score score = list.get(i);
			System.out.println(score);
		}
		
		System.out.println("B만 조회하기");
		for(int i = 0; i < list.size(); i++) {
			Score score = list.get(i);
			String name = score.getName();
			if(name.equals("B")){
				System.out.println(score);
			}
		}
		
		System.out.println("B만 조회하기");
		for(int i = 0; i < list.size(); i++) {
			Score score = list.get(i);
			String name = score.getName();
			if(name.equals("B")){
				System.out.println(score);
			}
		}
		
		//System.out.println("B만 삭제하기");
		int index = 2;
		list.remove(index-1);
		
		System.out.println("전체조회");
		for(int i = 0; i < list.size(); i++) {
			Score score = list.get(i);
			System.out.println(score);
		}
		
		System.out.println("C 성적 변경하기");
		String searchName = "C";
		for(int i = 0; i<list.size(); i++) {
			Score score = list.get(i);
			if(score.getName().equals(searchName)) {
				score.setEng(91);
				System.out.println(score);
			}
		}
	}

}
