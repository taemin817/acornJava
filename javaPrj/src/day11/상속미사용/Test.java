package day11.상속미사용;

public class Test {

	public static void main(String[] args) {

		Professor p = new Professor();
		p.가르치기();
		p.말하기();
		p.먹기();
		p.걷기();
		p.잠자기();

		Researcher r = new Researcher();
		r.연구하기();
		r.말하기();
		r.먹기();
		r.걷기();
		r.잠자기();
		
		StudentWorker sw = new StudentWorker();
		sw.일하기();
		sw.말하기();
		sw.먹기();
		sw.걷기();
		sw.잠자기();
		
		Student s = new Student();
		s.공부하기();
		s.말하기();
		s.먹기();
		s.걷기();
		s.잠자기();

	}

}
