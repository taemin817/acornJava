package day10;

public class myMath_class {

	public static int add(int su1, int su2) {
		return su1+su2;
	}
	
	public static int abs(int su) {
		int result = 0;
		if(su>=0) {
			result = su;
		}else if(su<0) {
			result = -su;
		}
		return result;
	}
}
