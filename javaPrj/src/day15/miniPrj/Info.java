package day15.miniPrj;

public class Info implements InfoCompare{

	private String id;
	private String name;
	private int pNum;
	
	public Info() {};		// 기본생성자
	
	public Info(String id, String name, int pNum) {
		this.id = id;
		this.name = name;
		this.pNum = pNum;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	@Override
	public String toString() {
		return id+","+name+","+pNum;
	}

	@Override
	public int compareTo(Object o) {
		
		Info s = (Info)o;
		return this.name.compareTo(s.getName());	// 이름순으로 정렬
	}
	
}
