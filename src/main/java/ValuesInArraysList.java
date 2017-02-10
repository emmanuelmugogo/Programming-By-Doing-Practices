import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ValuesInArraysList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i = 0; i < 10; i++) {
			int rNumber = random.nextInt(50) + 1;
			
			numbers.add(rNumber);
		}
		
		System.out.println("ArrayList: " + numbers + "\nValue to find: ");
		int valueToFind = scanner.nextInt();
		
		if (numbers.contains(valueToFind)) {
			System.out.println(valueToFind + " is in the ArrayList");
		}
		
		scanner.close();
	}

}
