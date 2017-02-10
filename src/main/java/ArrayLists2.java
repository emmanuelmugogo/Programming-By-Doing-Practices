import java.util.ArrayList;
import java.util.Random;

public class ArrayLists2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		//This gets a random class
		Random randomNum = new Random();
		
		

		for (int i = 0; i < 10; i++) {
			
		// You can use this as well to get a random number with parameters.
		//	int randomNum = (int) (Math.random() * ( 100 - 1 ) + 1);
			
			int rNum = randomNum.nextInt(100) + 1;
			num.add(rNum);	
		}
		
		System.out.println("ArrayList: " + num);
	}

}
