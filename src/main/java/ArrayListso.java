import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListso {

	public static void main(String[] args) {
		
		ArrayList <Integer> num = new ArrayList<>();
		num.add(-113);
		num.add(-113);
		num.add(-113);
		num.add(-113);
		num.add(-113);
		num.add(-113);
		num.add(-113);
		num.add(-113);
		num.add(-113);
		num.add(-113);
		
		
		//Printing out using Iterator
		Iterator<Integer> iter = num.iterator();
		
		while(iter.hasNext()) {
			int currentNum = iter.next();
			System.out.println(currentNum);
		}
		
		System.out.println("\n\n");
		//For each with Lambda
		 num.forEach(number->System.out.println(number));
		  
		System.out.println("\n\n");
		//Another weird way of printing Lol
		 num.forEach(System.out::println);

	}

}
