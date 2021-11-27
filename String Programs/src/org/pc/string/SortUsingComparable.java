package org.pc.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingComparable {

	public static void main(String[] args) {
		
		List<StudentComparable> list = new ArrayList<StudentComparable>();
		list.add(new StudentComparable(123, "Praveen", 50000));
		list.add(new StudentComparable(456, "Raja", 10000));
		list.add(new StudentComparable(789, "Rani", 40000));
		list.add(new StudentComparable(147, "Rama", 30000));
		
		Collections.sort(list);
		list.forEach(System.out::println);

	}

}
