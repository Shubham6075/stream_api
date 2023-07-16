package StreamFunctions;

import java.util.Arrays;
import java.util.List;

public class Perform_Cube {
	public static void main(String[] args){

		List<Integer> myList = Arrays.asList(4,5,6,7,1,2,3);
		myList.stream()
				.map(i->i*i*i)
				.filter(i-> i>50)
				.forEach(System.out::println);
	}
}
