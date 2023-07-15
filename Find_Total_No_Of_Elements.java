package StreamFunctions;

import java.util.Arrays;
import java.util.List;

public class Find_Total_No_Of_Elements {
	public static void main(String[] args){

		List<Integer> myList = Arrays.asList(10,15,8,25,49,32,98,98,15);

		long count = myList.stream().count();
		System.out.println(count);
	}
}
