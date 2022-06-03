package assi;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {

		List<Product> listOfProducts = new LinkedList<Product>();
		Product p1 = new Product(1L, "abc", "book", 600.0);
		listOfProducts.add(p1);
		Product p2 = new Product(2L, "physics", "book", 80.0);
		listOfProducts.add(p2);
		Product p3 = new Product(3L, "math", "book", 170.0);
		listOfProducts.add(p3);
		Product p4 = new Product(4L, "Soap", "baby", 200.0);
		listOfProducts.add(p4);
		Product p5 = new Product(5L, "video Game", "Toys", 650.0);
		listOfProducts.add(p5);

		// 1. Obtain a list of products belongs to category “Books” with price > 100
		listOfProducts.stream().filter(s -> s.getPrice() > 100.0).forEach(book -> System.out.println(book.getName()));

		Set<Product> set1 = new HashSet<Product>();
		set1.add(p1);
		Set<Product> set2 = new HashSet<Product>();
		set2.add(p2);
		Set<Product> set3 = new HashSet<Product>();
		set3.add(p3);
		Set<Product> set4 = new HashSet<Product>();
		set4.add(p4);

		List<Order> listOfOrder = new LinkedList<Order>();
		listOfOrder.add(new Order(100L, LocalDate.parse("2020-09-08"), LocalDate.parse("2020-09-11"), "Deliverd",
				new Customer(), set1));
		listOfOrder.add(new Order(105L, LocalDate.parse("2020-06-03"), LocalDate.parse("2020-06-06"), "Deliverd",
				new Customer(), set4));
		listOfOrder.add(new Order(110L, LocalDate.parse("2021-03-21"), LocalDate.parse("2020-05-05"), "Deliverd",
				new Customer(), set2));
		listOfOrder.add(new Order(114L, LocalDate.parse("2020-03-15"), LocalDate.parse("2020-07-09"), "Deliverd",
				new Customer(), set3));

		List<Order> collect = listOfOrder.stream()
				.filter(a -> a.getProducts().stream().anyMatch(b -> b.getCategory().equals("baby")))
				.collect(Collectors.toList());
		// 2. Obtain a list of order with products belong to category “Baby”
		System.out.println(collect);

		List<Double> collect2 = listOfProducts.stream().filter(s -> s.getCategory().equals("Toys"))
				.map(m -> m.getPrice() * 0.9).collect(Collectors.toList());
		// 3.Obtain a list of product with category = “Toys” and then apply 10% discount
		System.out.println(collect2);
		
		

		Optional<Product> findFirst = listOfProducts.stream().filter(f -> f.getCategory().equals("book"))
				.sorted(Comparator.comparing(Product::getPrice)).findFirst();
		// 4.Get the cheapest products of “Books” category
		System.out.println(findFirst);

		List<Order> collect3 = listOfOrder.stream().sorted((o1, o2) -> o2.getOrderDate().compareTo(o1.getOrderDate()))
				.limit(3).collect(Collectors.toList());
		// 5.Get the 3 most recent placed order
		System.out.println(collect3);

		// 6.Get a list of orders which were ordered on 15-Mar-2021, log the order
		// records to the console and then return its product list
		List<Product> collect4 = listOfOrder.stream().filter(s -> s.getOrderDate().isEqual(LocalDate.parse("2021-03-15")))
				 .peek(o -> System.out.println(o.toString()))
				    .flatMap(o -> o.getProducts().stream())
				    .distinct()
				    .collect(Collectors.toList());
		System.out.println("list "+ collect4);

		// 7.Calculate total lump sum of all orders placed in Feb 2021
		List<Order> collect5 = listOfOrder.stream()
				.filter(s -> s.getOrderDate().isBefore(LocalDate.parse("2021-02-01"))).collect(Collectors.toList());
		System.out.println(collect5);

		// 8.Obtain a data map with order id and order’s product count from the order
		// list.

		Map<Long, Integer> collect6 = listOfOrder.stream()
				.collect(Collectors.toMap(order -> order.getId(), order -> order.getProducts().size()));
		System.out.println(collect6);

		// 9.Produce a data map with order records grouped by customer from the order
		// list

		Map<Customer, List<Order>> collect7 = listOfOrder.stream().collect(Collectors.groupingBy(Order::getCustomer));
		
		System.out.println(collect7);
		

	}

}
