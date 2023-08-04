package day14.IOEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx01_FileInputStream {

	public static void main(String[] args) {
	 
			FileInputStream fis;
			try {							// 0 하나 들어있다면
				fis = new FileInputStream("res/test.txt");
				int data1 = fis.read(); // 0 -> 48
				System.out.println(data1);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
