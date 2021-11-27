package org.pc.string;

public class StudentComparable implements Comparable<StudentComparable> {
	
	public int empid;
	public String ename;
	public float sal;
	
	public StudentComparable(int empid, String ename, float sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}

	

	@Override
	public String toString() {
		return "StudentComparable [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
	}



	@Override
	public int compareTo(StudentComparable st) {
		return ename.compareTo(st.ename);
	}

}
