package assi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Person {

	String name;
	int group;

	
	public Person(String name, int group) {
		super();
		this.name = name;
		this.group = group;
	}


	public String getName() {
		return name;
	}


	public int getGroup() {
		return group;
	}


	public static void main(String[] args) {

		
		List<Person> student= new ArrayList<Person>();
		
		Scanner scan= new Scanner( System.in);
		
		while(student.size()<10) {
			System.out.println("Enter Persone Name");
			String name = scan.next();
			System.out.println("Enter its id");
			int groupId = scan.nextInt();
			student.add(new Person(name, groupId));
		}
		
		
				
		System.out.println("First Question Answer");
		student.stream().forEach(s->System.out.println(s.group+" - "+ s.name));
		System.out.println("\nSecond Question Answer");
		Map<Integer, List<Person>> collect = student.stream().collect(Collectors.groupingBy(s->s.group));
		
		System.out.println(collect.toString());
		
		
		List<Integer> list= Arrays.asList(100,60,32,98,154);
		
		OptionalDouble average = list.stream().mapToInt(s->(s)).average();
		System.out.println(average);
		
		
		
		List<Integer> a = Arrays.asList(10,344,658,966);
        List<Integer> b = Arrays.asList(340,67,233,109);
        List<Integer> c = Arrays.asList(404,501,200,201);
        
        List<List<Integer>> list2 = new ArrayList<List<Integer>>();
        list2.add(a);
        list2.add(b);
        list2.add(c);
        
        List<Integer> collect2 = list2.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		
		System.out.println(collect2);
		
	}


	@Override
	public String toString() {
		return "Persone [name=" + name + "]";
	}
	

}
