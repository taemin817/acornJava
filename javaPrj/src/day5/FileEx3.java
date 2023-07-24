package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fin = new FileInputStream("res/data.txt"); 
		FileOutputStream fout =new FileOutputStream("res/dataCopy3.txt");
		
		int x;
		
				// 파일의 끝이 아닐 동안
		while ((x=fin.read()) !=-1) {
			fout.write(x);
		}
	}

}