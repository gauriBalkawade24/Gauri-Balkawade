import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array of integer value.
		Integer[] Array = { 1, 2, 3, 4, 5, 6, 7 };
		
		//create a list from the array
		List<Integer> newList = Arrays.asList(Array);     
		
		//Use Collections class shuffle() method to shuffle array elements.
		Collections.shuffle(newList);

		//Then convert the list to the original array.
		newList.toArray(Array);

		//printing output of shuffle array elements.
		System.out.println(Arrays.toString(Array));


	}

}
