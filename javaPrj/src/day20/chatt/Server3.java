package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {

	// 서버는 서버소켓이 있어야한다
	ServerSocket ss;
	// 클라이언트와 통신할 수 있는 소켓
	Socket s;

	// 보조스트림
	DataInputStream dis;
	DataOutputStream dos;

	public Server3() {
		try {
			ss = new ServerSocket(5500);
			// 대기상태에 있다가 client가 요청하면 통신할 수 있는 소켓을 생성하여 반환
			System.out.println("server start");
			s = ss.accept();
			System.out.println("client 요청");
			
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			// 받기
			dataRecv();
			
			// 보내기
			dataSend();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void dataSend() {

		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("메세지 작성");
//			String message = sc.nextLine();
//			try {
//				dos.writeUTF(message);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					String message = sc.nextLine();
					try {
						dos.writeUTF(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	}
	
	
	
	
	private void dataRecv() {
//		while(true) {
//			System.out.println("메세지 수신");
//			String message;
//			try {
//				message = dis.readUTF();
//				System.out.println(message);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					String message;
					try {
						message = dis.readUTF();
						System.out.println(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		t.start();
	}

	public static void main(String[] args) {
		Server3 s = new Server3();
	}

}
