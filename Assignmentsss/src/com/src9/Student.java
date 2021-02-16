package com.src9;

public class Student implements Comparable {
	private int studentid;
	private String studentname;	

	public Student() {
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentid;
	}
		
	public Student(int studentid, String studentname) {
		
		this.studentid = studentid;
		this.studentname = studentname;
		
	}

	@Override
	public boolean equals(Object obj) {
		Student st=(Student) obj;
		return this.studentid==st.studentid;
	}

	@Override
	public String toString() {
		return "student [studentid=" + studentid + ", studentname=" + studentname +"]";
	}

	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student) o;
		if(this.studentid>s.studentid)
		{
			return 1;
		}
		else if(this.studentid<s.studentid)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
