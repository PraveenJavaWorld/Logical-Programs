package org.pc.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingComparator {

	public static void main(String[] args) {
		
		List<StudentComparator> list = new ArrayList<StudentComparator>();
		list.add(new StudentComparator(123, "Praveen", 50000));
		list.add(new StudentComparator(456, "Raja", 10000));
		list.add(new StudentComparator(789, "Rani", 40000));
		list.add(new StudentComparator(147, "Rama", 30000));
		
		Comparator<StudentComparator> comp = new StudentComparator();
		
		Collections.sort(list, comp);
		list.forEach(System.out::println);

	}

}
