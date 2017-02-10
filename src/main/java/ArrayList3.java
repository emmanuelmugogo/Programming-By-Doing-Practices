import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayList3 {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();
		
		Random random = new Random();
		
		int j = 0;
		
		for (int i = 0; i < 1000; i++) {
			
			int rNumber = random.nextInt(81) + 10;
			num.add(rNumber);
			
		}
		
		System.out.println("\n\n now my List size is " + num.size() + "\n");
		
//this helps to print 100 on one row.
		for(int x: num) {
			System.out.print(x + ", ");
			if(j%100 == 99) {
				System.out.println("\n");
			}
			j++;
		}
		
		System.out.println("\n\n\n\n");
		
//This will print 10 in a row.	
Iterator<Integer> iter = num.iterator();
        
        while(iter.hasNext())
        {
            Integer x = iter.next();
            System.out.print(x + ", ");
            if(j % 10 == 9)
                System.out.println("\n");
            j++;
        }
	}

}
