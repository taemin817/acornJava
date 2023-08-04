package day14.quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class quiz02 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("res/likey.txt"));
			while(true) {
			String data = br.readLine();
			if(data == null)break;
			System.out.println(data);
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
