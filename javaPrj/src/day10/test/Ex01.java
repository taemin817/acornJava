package day10.test;

import day10.mkYak;

public class Ex01 {

	public static void main(String[] args) {
		// class는 우선 같은 폴더, 같은 패키지에서 찾고
		// 없으면 import 사용하여 클래스의 패키지/폴더 정보를 제공해야함
		
		int[] result = mkYak.getYak(6);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
	}

}
