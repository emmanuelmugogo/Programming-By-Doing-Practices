import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int rNum = r.nextInt(100) + 1;
			num.add(rNum);
		}
		
		System.out.println("ArrayList 1: " + num);
		
		ArrayList<Integer> num2 = num;
		//This removes the last element on my List
		num2.remove(num2.get(num2.size()-1));
		//This add back -7 on the list.
		num2.add(-7);
		
		
		System.out.println("ArrayList 2: " + num2);

	}

}
