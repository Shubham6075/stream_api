package StreamFunctions;

import java.util.Arrays;
import java.util.List;

public class Find_Maximum_value_Element_in_List {
	public static void main(String[] args){

		List<Integer> myList = Arrays.asList(10,15,8,9,25,32,98,98,49,15);

		// Finding maximum value integer

		int max = myList.stream()
				.max(Integer::compare)
				.get();
		System.out.println("Max : " +max);

		System.out.println();

		// Finding minimum value integer

		int min = myList.stream()
				.min(Integer::compare)
				.get();
		System.out.println("Min : " +min);
	}
}
