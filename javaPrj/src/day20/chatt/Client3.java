package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client3 {

	Socket s;
	
	//보조스트림
	DataInputStream dis;
	DataOutputStream dos;
	
	public Client3() {
		try {
			s = new Socket("61.73.130.228", 6100);
			System.out.println("server 요청");
		
			// 소켓 두개의 기반 스트림이 있음
			dis = new DataInputStream( s.getInputStream());
			dos = new DataOutputStream ( s.getOutputStream());
			
			// 보내기
			dataSend();
			
			//받기
			dataRecv();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		Client3 client3 = new Client3();
		
		
		
	}
	

}
