package day07;

public class Ex08 {

	public static void main(String[] args) {

		int result1 = a(4);
		System.out.println(result1);
		int result2 = b('b');
		System.out.println(result2);
		char result3 = c(10);
		System.out.println(result3);
		double result4 = d();
		System.out.println(result4);
		String result5 = e();
		System.out.println(result5);
	}

    		  //반환타입  //입력정보
	public static int a(int a) {
		System.out.println("a 호출");
	return 3;
	}
	
	public static int b(char a){
		System.out.println("b 호출");
	return 4;
	}
	
	public static char c(int a){
		System.out.println("c 호출");
	return 'c';
	}
	
	public static double d(){
		System.out.println("d 호출");
	return 2.5;
	}
	
	public static String e(){
		System.out.println("e 호출");
	return "안녕";
	}
	
}
