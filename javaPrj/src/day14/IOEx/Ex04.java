package day14.IOEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) {
	
		InputStreamReader ir = new InputStreamReader(System.in);
								// Scanner 클래스와 비슷
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));

		try {
			String data = bs.readLine();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
