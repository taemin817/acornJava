package day12.인터페이스;

import java.util.Scanner;

public class CalculatorProgram {		
	 public static void main(String[] args) {	
		 
		 Scanner sc = new Scanner(System.in); 		 
		 System.out.print("두 수 입력");
		 int num1= sc.nextInt();
		 int num2= sc.nextInt();		 		 	 
		 //CalculatorI cal = new 표준태_Calculator();	
		 CalculatorI cal = new 김현수_MyCalculator();	

		 int result = cal.add(num1, num2);
		 System.out.println(result);
		 
		 int result2 = cal.sub(num1, num2);
		 System.out.println(result2);
		 
		 int result3 = cal.multi(num1, num2);
		 System.out.println(result3);
		 
		 int result4 = cal.divide(num1, num2);
		 System.out.println(result4);
	 } 
	

}
