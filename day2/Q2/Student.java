package day2.Q2;

public class Student implements Comparable<Student>{
	
	private int roll;
	private String name;
	private int marks;
	
	
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int roll, String name,int marks) {
		// TODO Auto-generated constructor stub
		
		this.setRoll(roll);
		this.setName(name);
		this.setMarks(marks);
	}
	

	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public int compareTo(Student O) {
		// TODO Auto-generated method stub
		int S1 = this.getMarks();
		int S2 = O.getMarks();
		if(S1>S2) {
			return +1;
		}else if(S1<S2) {
			return -1;
		}
		
		return +1;
	}
	
	
	

}
