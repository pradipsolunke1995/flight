package assi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment7 {

	public static void main(String[] args) {

		List<String> country = new ArrayList<String>();
		country.add("USA");
		country.add("Japan");
		country.add("France");
		country.add("Germany");
		country.add("Italy");
		country.add("U.K.");
		country.add("Canada");

		List<String> G7Countries = country.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(G7Countries);

	}
}
