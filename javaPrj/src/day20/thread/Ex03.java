package day20.thread;

public class Ex03 {

	public static void main(String[] args) {

		Thread1 th1 = new Thread1();
		th1.start();	// run()말고 start()를 호출해야해!
		
		Thread2 th2 = new Thread2();
		th2.start();                                      
	}

}
// 수행할 코드를 작성하는 것
// void run()
class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println((i+1)+". hi");
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println((i+1)+". bye");
		}
	}
}