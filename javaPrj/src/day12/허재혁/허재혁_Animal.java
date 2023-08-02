package day12.허재혁;

public class 허재혁_Animal {
	
	
	String name;
	String fname;
	
	
	public 허재혁_Animal() {
		 this("동물이름","별명");
	}
	
	public 허재혁_Animal(String name, String fname) {
		this.fname=fname;
		this.name=name;
	}
	
	
	public String toString() {
		return "이름:"+ name +" 별명:"+  fname;
	}

}
