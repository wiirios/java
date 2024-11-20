package streamApi.org.william;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Client> list = new ArrayList<>();
		
		list.add(new Client("Jason", 34));
		list.add(new Client("Mike", 38));
		list.add(new Client("John", 21));
		
		list.stream().forEach(c -> System.out.println(c.getName()));

		System.out.println("Person Filter");
		System.out.println("----");		
		List<Client> clientsFilter = list.stream()
			.filter(c -> c.getAge() > 30)
			.collect(Collectors.toList());

		clientsFilter.stream()
			.forEach(c -> System.out.println(c.getName()));
		
		List<Integer> listNumbers = new ArrayList<Integer>();		

		listNumbers.add(1);
		listNumbers.add(9);
		listNumbers.add(4);
		listNumbers.add(8);
		listNumbers.add(8);
		System.out.println("----");		
		System.out.println("Print each number in listNumbers (not sorted)");		
		System.out.println("----");	
		listNumbers.stream()
				.forEach(System.out::println);

	 	List<Integer> numbersSorted = listNumbers
	 			.stream()
	 			.sorted()
	 			.collect(Collectors.toList());
		
		System.out.println("----");		
		System.out.println("Numbers Sorted");		
		System.out.println("----");
		numbersSorted.stream()
				.forEach(System.out::println);	
		
		System.out.println("----");		
		System.out.println("Print the numbers that are even and remove duplicate numbers");		
		System.out.println("----");	
		listNumbers.stream()
				.filter(n -> n % 2 == 0)
				.distinct()
				.forEach(System.out::println);
	}

}
