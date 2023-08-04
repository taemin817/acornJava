package day14.IOEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class FileEx07_ObjectOutput {

	public static void main(String[] args) {
		// 아래내용을
		Score s = new Score("홍길동", 100);
		Score s2 = new Score("김길동", 100);
		
		try {	// 아래 파일에 보냄
			ObjectOutput os = new ObjectOutputStream
					(new FileOutputStream("res/output2.txt"));
			
			os.writeObject(s);
			os.writeObject(s2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
