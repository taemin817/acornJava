package day12.허재혁;

public class 허재혁_AnimalInfo extends 허재혁_Animal {

	int age;

	public 허재혁_AnimalInfo(String name, String fname, int age) {
		
		super(name, fname);
		this.age = age;

	}

	public String toString() {
		return "이름:"+ name +" 별명:"+  fname + " 나이:" + age;
	}

}
