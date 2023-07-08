package StreamFunctions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Duplicate_Elements {
	public static void main(String[] args){
		List<Integer> myList = Arrays.asList(10,15,8,49,32,98,98,15);
		Set<Integer> set = new HashSet<>();
		myList.stream()
				.filter(n->!set.add(n))
				.forEach(System.out::println);
	}
}
