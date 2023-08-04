package day14.IOEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx03_FileReader {

	public static void main(String[] args) {

		try {
			FileReader fis = new FileReader("res/test.txt");
			
			int data = fis.read();
			System.out.println((char)data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
