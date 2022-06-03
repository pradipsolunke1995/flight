package com.axyya.assignment;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class Employee {

	int id;

	String name;

	String dept;

	String designation;

	long salary;

	public Employee(int id, String name, String dept, String designation, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.designation = designation;
		this.salary = salary;
	}

	public static void main(String[] args) {

		List<Employee> emp = new LinkedList<Employee>();

		Employee e= new Employee(101, "Vaibhav", "Dev", "SE", 9000);
		emp.add(e);
		emp.add(new Employee(105, "Kiran", "Dev", "SSE", 12000));
		emp.add(new Employee(109, "Akshay", "Testing", "SSE", 11000));
		emp.add(new Employee(111, "Harish", "Testing", "SE", 8000));
		emp.add(new Employee(103, "Shilpa", "Dev", "SSE", 10000));
		emp.add(new Employee(1102, "Heena", "Dev", "SSE", 14000));

		// 1. Create list of employees and filter the elements where salary &gt; 10000
		// using predicate interface.
		emp.stream().filter(result -> result.salary >= 10000).forEach(System.out::println);

		// 2. Create a Function interface identifier and add 20000 salary increment to
		// each employee in the list.
		emp.stream().map(s -> s.salary + 20000).forEach(System.out::println);

		// 3. Create a function interface identifier to get employees whose names begin
		// with ‘H’.
		emp.stream().map(s -> s.name + "").filter(s -> s.startsWith("H")).forEach(System.out::println);
		
		Function<Employee, Integer> f= new Function<Employee,Integer>() {

			@Override
			public Integer apply(Employee t) {
				
				return (int) (t.salary+20000);
			}

		};
		System.out.println("\nBy Learned Approch");
		emp.stream().map(f).forEach(System.out::println);
		
		
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", designation=" + designation + ", salary="
				+ salary + "]";
	}

}
