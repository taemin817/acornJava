package day14.IOEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx02_FileInputStream_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//데이터가 들어오는 길
			FileInputStream fis = new FileInputStream("res/test.txt");
			
			/*
			int su;
			su=fis.read();
			int su;
			su=fis.read();
			int su;
			su=fis.read();
			*/
			while(true) {
				int su;
				su = fis.read();
				if(su == -1)break;
				System.out.println((char)su);
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
