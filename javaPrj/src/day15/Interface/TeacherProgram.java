package day15.Interface;

public class TeacherProgram {	
	
	MyRunnable r;
	
	public void setR(MyRunnable r) {
		this.r = r;
	}
	public void run() {
		r.run();
	}
	public static void main(String[] args) {	 
		System.out.println("학생들이 작성한 코드를 실행시켜드립니다");
		TeacherProgram p = new TeacherProgram();
		/*p.setR( new MyRunnable() {
			@Override
			public void run() {
			     System.out.println("태민코드 실행합니다");				
			}} );
		p.run();
		*/
		p.setR(new Jek());
		p.run();

		p.setR(new Hjh());
		p.run();

		p.setR(new Kjy());
		p.run();

		p.setR(new Kmg());
		p.run();

		p.setR(new Mnj());
		p.run();
		
		p.setR(new Kbj());
		p.run();
		System.out.println();
		p.setR(new Kdy());
		p.run();
	}
}
