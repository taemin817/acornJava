package day12.김민규;

public class PizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		불고기피자 b = new 불고기피자();
		
		b.불고기();
		b.도우();
		b.소스();
		b.치즈();
		b.페퍼로니();
		b.올리브();
		b.양파();
		b.소시지();
	
		Pizza p2 = b; // upcasting
		p2.도우();
		
		하와이안피자 p = new 하와이안피자();
		
		p.파인애플();
		p.도우();
		p.소스();
		p.치즈();
		p.페퍼로니();
		p.올리브();
		p.양파();
		p.소시지();

		p2 = p;
		p.치즈();
		
		((하와이안피자)p2).파인애플();
		
		/* 잘못된 다운캐스팅
		Pizza pi = new Pizza();
		
		불고기피자 bi = (불고기피자)pi;
		bi.소스();
		*/
		
	}
	
	
}
