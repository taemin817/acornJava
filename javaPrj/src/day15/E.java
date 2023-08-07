package day15;

public class E implements MyRunnable{

	@Override
	public void run() {

		System.out.println("실행할 코드~");
		for(int i =0; i<5; i++) {
			System.out.print("☆");
		}System.out.println();
	}

	
}
