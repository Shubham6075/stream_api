package StreamFunctions;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_First_Repeated_Character {
	public static void main(String[] args){

		String input = "Java Articles are Awesome";

		Character result = input.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1L)
				.map(entry -> entry.getKey())
				.findFirst()
				.get();
		System.out.println(result);
	}
}
