import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
//		for (int i = 0; i < 10; i++) {
//			num.add(-113);
//			System.out.println("Slot " + i + " contains a " + num.get(i));
//		}
		
		System.out.println("Alternative Approach");
		
		for (int i = 0; i < 10; i++) {
			num.add(-113);
			System.out.println("Slot " + (num.size()-1) + " contains a " + num.get(i));
		}
	}

}
