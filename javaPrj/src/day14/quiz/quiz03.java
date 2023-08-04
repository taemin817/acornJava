package day14.quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class quiz03 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("res/KorScore.txt"));
			double sum = 0;
			double avg;
			int i=0;
			while(true) {
				String data = br.readLine();
				if(data == null)break;
				System.out.print(data+" ");
				double dataSum = Integer.parseInt(data);
				sum+=dataSum;
				i++;
			}
			System.out.println();
			System.out.println("10명 총합 : "+sum);
			avg=sum/i;
			System.out.println("10명 평균 : "+avg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
