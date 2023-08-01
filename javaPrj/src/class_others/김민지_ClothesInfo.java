package class_others;

public class 김민지_ClothesInfo {

	String name;
	String product_number;
	int reviewNum;
	int price;
	int length;
	
	public void input(String name,String product_number, int reviewNum,int price,int length   ) {
		
		this.name=name;
		this.product_number=product_number;
		this.reviewNum=reviewNum;
		this.price=price;
		this.length=length;
		
	}
	
	public void printInfo() {
		System.out.println("상품명: "+name);
		System.out.println("품번: "+product_number);
		System.out.println("리뷰수: "+reviewNum);
		System.out.println("가격: "+price);
		System.out.println("총장: "+length);
	}
	
}
