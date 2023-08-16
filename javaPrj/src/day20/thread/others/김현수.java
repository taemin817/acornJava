package day20.thread.others;

public class 김현수 {

	public static void main(String[] args) {

		Thread01 th1 = new Thread01();
		th1.start();

		Thread th2 = new Thread(new RunnableYoutubeImp());
		th2.start();

	}

}

class Thread01 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				sleep(1500);
				System.out.println((i + 1) + "번째 다운로드 완료.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class RunnableYoutubeImp implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
				System.out.println((i + 1) + "번째 영상을 재생합니다.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
