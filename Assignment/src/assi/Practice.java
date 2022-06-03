package assi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Practice {

	int rollNum;
	String name;

	public Practice(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}

	public static void main(String[] args) {

	
		List<Practice> student = new LinkedList<Practice>();
		student.add(new Practice(15, "Akshay"));
		student.add(new Practice(29, "Rohit"));
		student.add(new Practice(13, "Neha"));
		student.add(new Practice(5, "Rahul"));
		student.add(new Practice(2, "Shiva"));
		student.add(new Practice(1, "Pradip"));
		student.add(new Practice(50, "Vaibhav"));
		
		Collections.sort(student, new SortRollNumber());
		System.out.println(student);
		
		

	}

	@Override
	public String toString() {
		return "Practice [rollNum=" + rollNum + ", name=" + name + "]";
	}

}
