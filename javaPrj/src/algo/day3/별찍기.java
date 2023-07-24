package algo.day3;

import javax.security.auth.kerberos.KerberosCredMessage;

import org.w3c.dom.ls.LSOutput;

public class 별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 5; k >= i; k--) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
				}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
}