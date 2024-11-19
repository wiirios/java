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
		
		System.out.println("----");		
		
		List<Client> clientsFilter = list.stream()
			.filter(c -> c.getAge() > 30)
			.collect(Collectors.toList());

		clientsFilter.stream()
			.forEach(c -> System.out.println(c.getName()));
		
			
	}

}
