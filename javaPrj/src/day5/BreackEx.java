package day5;

public class BreackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break -> while, switch, for
		// 자신이 속한 반복문 탈출
		
		// 1~10
		int i = 0;
		int sum = 0;
		while (true) { // 탈출조건을 주어야함
			i++;
			sum+=i;
			if (i>=10)
				break;
		}System.out.println(sum);
		
		
	}

}
