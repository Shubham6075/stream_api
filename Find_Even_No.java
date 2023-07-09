package StreamFunctions;

import java.util.Arrays;
import java.util.List;

public class Find_Even_No {
	public static void main(String[] args){
		List<Integer>list = Arrays.asList(10,15,8,25,49,98,32);
		list.stream().filter(n->n%2==0).
				forEach(System.out::println);
	}

}
