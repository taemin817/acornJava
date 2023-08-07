package day15.Interface;

public class Kmg implements MyRunnable {

	@Override
	public void run() {
		
	    String[] meal = {"굶는다", "양식", "한식", "중식", "일식"};

	    int index = (int) (Math.random() * meal.length);
	    String randomMeal = meal[index];

	    System.out.println("오늘 밥: " + randomMeal);
	}

	
}
