package day14.IOEx;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int su = System.in.read();
			System.out.println(su);
			
			su = System.in.read();
			System.out.println(su);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
