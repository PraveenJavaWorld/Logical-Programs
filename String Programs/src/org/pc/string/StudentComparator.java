package org.pc.string;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentComparator> {
	
	
	public int empid;
	public String ename;
	public float sal;
	
	public StudentComparator(int empid, String ename, float sal) {
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	

	public StudentComparator() {
		
	}


	@Override
	public String toString() {
		return "StudentComparator [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
	}


	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		int k = o1.ename.compareTo(o2.ename);
		if(k>1) {
			return 1;
		}
		return -1;
	}


	

}
