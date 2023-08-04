package day14.IOEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileEx09 {

	public static void main(String[] args) {

				 
					ObjectInputStream oi;
					try {
						oi = new ObjectInputStream(new FileInputStream("res/output2.txt"));
						Score s = (Score)oi.readObject();
					} catch (IOException | ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 
				
			
	}
}

