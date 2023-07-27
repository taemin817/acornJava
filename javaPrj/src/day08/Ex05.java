package day08;

public class Ex05 {

	public static void main(String[] args) {

		int[] result = getMoneyCount(66660);
		
		for(int moneyUnit : result) {
			System.out.print(moneyUnit + " ");
		}
		// 함수의 결과를 사용하고싶다면
		
		

	}

	public static int[] getMoneyCount(int money) {
		int [] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int [] moneyArrMain = new int [moneyArr.length];
		
		for(int i = 0 ; i <moneyArr.length; i++ ) {
			moneyArrMain[i]= money / moneyArr[i];
			money %= moneyArr[i];
		}
		
        System.out.print("돈 매수 구하기: ");
//        for(int i=0 ; i < moneyArrMain.length; i++) {
//            System.out.print(moneyArrMain[i] + " ");
//        }
        return moneyArrMain;
	}

}
