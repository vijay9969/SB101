package day2.Q4;



public class Student{

	private int StudentId;
	private String studentName;
	private int marks;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name,int marks) {
		// TODO Auto-generated constructor stub
		this.setStudentId(id);
		this.setStudentName(name);
		this.setMarks(marks);
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
//	@Override
//	public int compareTo(Student O) {
//		// TODO Auto-generated method stub
//		int S1 = this.getMarks();
//		int S2 = O.getMarks();
//		if(S1>S2) {
//			return +1;
//		}else if(S1<S2) {
//			return -1;
//		}
//		
//		return +1;
//	}
}
