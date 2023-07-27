package day03.algo;

public class 연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 연산을 수행하면 연산의 결과가 발생
		 단항연산자 n++, --n
		 이항연산자 a+b a=b a*b a/b a%b
		 삼항연산자 (조건)?참:거짓
		 */
		 
		 //대입	연산자
		 int num=10;
		 
		 //부호 연산자
		 num= -num;
		 
		 //산술연산자
		 int a=90, b=80;
		 int sum=a+b;
		 int sub=a-b;
		 int multi=a*b;
		 double devide = a/(double)b;
		 
		 int remain = a%b;
		 
		 System.out.println(sum);
		 System.out.println(sub);
		 System.out.println(multi);
		 System.out.println(devide);
		 System.out.println(remain);
	}

}
