package day20.thread;

public class Ex04 {

	public static void main(String[] args) {

		// 수행해야할 코드를 작성하여 인자정보로 넘겨야함
		// Runnable 인터페이스로 약속되어있음
		Thread th1 = new Thread(new RunnableImp());
		th1.start();
		
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i<100; i++) {
					System.out.println((i+1)+". bye");
					}
				}
			}
			);
		th2.start();
	}
	
}
	
	/* interface Runnabla{
	  void run();
	  }
	 * 
	 1. 인터페이스를 이름있는 클래스로 작성해서 사용
	 2. 익명클래스를 사용
	 */

	class RunnableImp implements Runnable {
		@Override
		public void run() {
			for(int i = 0; i<100; i++) {
				System.out.println((i+1)+". hi");
			}
		}
	}

