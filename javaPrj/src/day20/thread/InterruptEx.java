package day20.thread;

public class InterruptEx {

	public static void main(String[] args) {

		ThreadEx th = new ThreadEx();
		th.start();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3초 뒤
		th.interrupt(); // interrupt 발생시킴. 진행은 계속됨
		System.out.println("메인 종료");
	}

}

class ThreadEx extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
//				e.printStackTrace();
				System.out.println("자다가 깸");
				return;    // interrupted 속성값을 다시 초기화 시킴  false 로  변경됨
			}
			System.out.println((i + 1) + ". hi");
			if(isInterrupted()) {
				System.out.println("일어나악");
				return;
			}
		}
	}
}