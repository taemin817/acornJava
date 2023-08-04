package day14.IOEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx06_FileWriter {

	public static void main(String[] args) {

		try {
			// 기반스트림 얻어보기
			// (파일)
			FileWriter w = new FileWriter("res/output.txt");
			w.write("good");
			w.flush(); // 데이터를 내보내는 행위
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
 