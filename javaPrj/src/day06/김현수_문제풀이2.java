package day06;

import java.util.Scanner;

public class 김현수_문제풀이2 {

	public static void main(String[] args) {
		
	int[] arr = new int[10];
	int i=0;
	int j=0;
	int num;
	int sum=0;
	Scanner sc = new Scanner(System.in);
	while(i<arr.length) {
		num = sc.nextInt();
		arr[i] = num;
		sum += arr[i];
		i++;
	}
	
	while(j<arr.length) {
		System.out.println(arr[j]);
		j++;
	}
	
	System.out.println("총합 : " + sum);
	}

}
