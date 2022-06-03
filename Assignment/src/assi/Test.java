package assi;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Product> listOfProducts = new LinkedList<Product>();
		Product p1=new Product(1L, "abc", "book", 600.0);
		listOfProducts.add(p1);
		Product p2=new Product(2L, "physics", "book", 80.0);
		listOfProducts.add(p2);
		Product p3=new Product(3L, "math", "book", 170.0);
		listOfProducts.add(p3);
		Product p4=new Product(4L, "video Game", "baby", 170.0);
		listOfProducts.add(p4);
				
		List<Order> listOfOrder = new LinkedList<Order>();
		listOfOrder.add(new Order(100L, LocalDate.parse("2020-09-08"), LocalDate.parse("2020-09-11"), "Deliverd",
				new Customer(), new HashSet<Product>(listOfProducts)));

		List<Order> collect = listOfOrder.stream()
				.filter(a -> a.getProducts().stream().anyMatch(b -> b.getCategory().equals("baby")))
				.collect(Collectors.toList());

		System.out.println(collect.toString());
	}
	

}
