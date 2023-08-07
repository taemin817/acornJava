package day15.정렬;

public class MyComparator_imp implements MyComparator{

	@Override
	public int compare(Object o1, Object o2) {
		Score s1 = (Score)o1;
		Score s2 = (Score)o2;
		
	
		return s1.getEng()-s2.getEng();	// -> 앞의 내용이 크면 양수, 작으면 음수가 나오는걸 구현
	}

}
