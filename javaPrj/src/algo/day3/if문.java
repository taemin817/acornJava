package algo.day3;

public class if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int myAge = 26;
		int yourAge = 27;
		
		if(myAge > yourAge){
			System.out.println("내가 형이야");
		}
		
		if(myAge > yourAge){
			System.out.println("내가 형이야");
		}else {
			System.out.println("친구이거나 네가 형이야");
		}
		
		if (myAge > yourAge) {
			System.out.println("내가 형이야");
		}else if(myAge == yourAge){
			System.out.println("우린 친구");			
		}else {
			System.out.println("네가 형이야");
		}
	}

}
