package day12.others;

public class polymorphism {

	public static void main(String[] args) {
		
		Person[] ddance = new Person[20];
		ddance[0] = new DunDun();
		ddance[1] = new 김민지_PersonDance();
		ddance[2] = new 김병진();
		ddance[3] = new 김재열_KJY();
		ddance[4] = new 김현수_Kimhs();
		ddance[5] = new 이윤정_Singer();
		ddance[6] = new 이정훈_Dance();
		ddance[7] = new 조은경_Samba();
		ddance[8] = new 서예진_Yejin();
		ddance[9] = new 허재혁_JHDance();
		ddance[10] = new 곽단야_Dance();
		
		for(int i = 0; i < ddance.length; i++) {
			ddance[i].dance();
		}
		
		// 1. 오버로딩 : 이름이 같고 매개변수가 다른것)
		// 2. 상속관계에서 오버라이딩 : 부모의 메서드를 재정의)
	}

}