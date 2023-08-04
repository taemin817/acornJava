package day14.IOEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx_반복 {

	public static void main(String[] args) {
		
	 
			FileInputStream fis;
			try {
				fis = new FileInputStream("res/test.txt");
				while(true) {
					int data1 = fis.read();
					if(data1 == -1)break;
					System.out.print((char)data1);
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
				
			}
	}

}
