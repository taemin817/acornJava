package day11;

public class Player_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Player P;
		P = new Player();
		P.volumeUp();
		P.volumeDown();
				
		//상위10곡 재생하기
		P.top10list();
				
		//랜덤곡 가져오기
		String randomMusic = P.랜덤재생하기();
		System.out.println( randomMusic);
	
	}

}
