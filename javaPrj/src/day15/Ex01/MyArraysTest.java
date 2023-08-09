package day15.Ex01;

public class MyArraysTest {

	public static void main(String[] args) {

		Score[] arr = new Score[3];		
		arr[0]= new Score("이길동",90,71);
		arr[1]= new Score("김길동",70,99);
		arr[2]= new Score("박길동",90,89);
		
		for( int i=0 ;  i < arr.length ; i++ ) {		// 배열순서대로 출력
			System.out.println(arr[i]);
		}
		System.out.println();
		MyArrays.sort(arr, new MyComparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Score s1 = (Score) o1;
				Score s2 = (Score) o2;
				
				return s1.getEng()- s2.getEng();	// 영어점수 오름차순 출력
			}});
		
		for( int i=0 ;  i < arr.length ; i++ ) {
			System.out.println(arr[i]);
		} 
		
	}

}
