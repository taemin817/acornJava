package day14.IOEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileEx08 {

	public static void main(String[] args) {
	ObjectInputStream oi;
	try {
		oi = new ObjectInputStream(new FileInputStream("res/output2.txt"));
		Score s = (Score)oi.readObject();
		System.out.println(s);
		
		s =(Score)oi.readObject();
		System.out.println(s);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
