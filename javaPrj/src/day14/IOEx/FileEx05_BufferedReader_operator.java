package day14.IOEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx05_BufferedReader_operator {

	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/test.txt"));
			
			int sum = 0;
			double avg;
			int count = 0; // 입력된 국어점수의 갯수
			while(true) {
				String data = bf.readLine();
				count++;
				if(data == null)break;
				System.out.println(data);
				int dataNumber = Integer.parseInt(data);
				sum += dataNumber;
			}
			avg=sum/count;
			System.out.println(avg);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

}
