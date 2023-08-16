package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server4_연습 {

	ServerSocket ss;
	Socket s;
	
	DataInputStream dis;
	DataOutputStream dos;
	
	public Server4_연습(){

		try {
			ss = new ServerSocket(5500);
			System.out.println("서버 실행");
			s = ss.accept();
			System.out.println("클라이언트 요청");
			
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
			dataRecv();
			
			dataSend();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void dataSend() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메세지작성>");
		String message = sc.nextLine();
		try {
			dos.writeUTF(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void dataRecv() {
		System.out.println("메세지수신>");
		try {
			String message = dis.readUTF();
			System.out.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Server4_연습 s = new Server4_연습();
	}

}
