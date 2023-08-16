package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client4_연습 {
	
	Socket s;
	
	DataInputStream dis;
	DataOutputStream dos;
	
	
	public Client4_연습() {
		try {
			s = new Socket("localhost", 5500);
			System.out.println("서버 요청");

			
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());

			dataSend();
			
			dataRecv();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
		Client4_연습 s = new Client4_연습();
		
		
	}

}
