package day14.IOEx;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {

		// 입출력스트림
		// 입력스트림 : 데이터가 들어오는길(입력전용 메모리버퍼)
		// 출력스트림 : 데이터가 나가는(출력전전용 메모리버퍼)
		
		// 기반스트림
		// 보조스트림
		
		// 바이트스트림
		try {
			int su = System.in.read();
			System.out.println((char)su);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
