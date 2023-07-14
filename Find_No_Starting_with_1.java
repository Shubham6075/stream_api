package StreamFunctions;

import java.util.Arrays;
import java.util.List;

public class Find_No_Starting_with_1 {
	public static void main(String[] args){
		List<Integer> mylist = Arrays.asList(10,15,8,49,25,98,32);

		mylist.stream().map(s->s +" ").
				filter(s->s.startsWith("1")).
				forEach(System.out::println);
	}

}
