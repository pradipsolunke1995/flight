package assi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Students {

	String first_name;
	String last_name;
	int group_id;
	int age;

	public int getAge() {
		return age;
	}

	public Students(String first_name, String last_name, int group_id, int age) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.group_id = group_id;
		this.age = age;
	}

	public static void main(String[] args) {

		

		List<Students> student = new ArrayList<Students>();

		student.add(new Students("Sara", "Mills", 1, 18));

		student.add(new Students("Andrew", "Gibson", 2, 21));

		student.add(new Students("Craig", "Ellis", 1, 23));

		student.add(new Students("Steven", "Cole", 2, 19));

		student.add(new Students("Andrew", "Carter", 2, 2));

		// 1. Print all students whose first name is before their last name
		// lexicographically
		System.out.println();
		student.stream().filter(s -> s.last_name.compareTo(s.first_name) > 0).forEach(b -> System.out.println(b.first_name));

		// 2. Print all students from group number 2

		student.stream().filter(s -> s.group_id == 2).forEach(b -> System.out.println(b.first_name));

		// 3. Find the eldest student

		Students maxAgeStudent = student.stream().max(Comparator.comparing(Students::getAge)).get();
		System.out.println(maxAgeStudent.first_name);

		// 4. Create an apt collection of students in such a way to have pair of first name
		// & age. The collection shall have student first names in ascending order.
		
		List<Students> collect = student.stream().sorted((a, b) -> a.first_name.compareTo(b.first_name)).collect(Collectors.toList());

		System.out.println(collect.toString());
		
		
	}

	@Override
	public String toString() {
		return "Students [first_name=" + first_name + ", age=" + age + "]";
	}

}
