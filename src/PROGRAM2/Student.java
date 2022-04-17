package PROGRAM2;

public class Student {
	

	int Rollno;
	String name;
	String Department;
	int semester;
	
	public Student(int Rollno, String name, String Department, int semester) {
		this.Rollno = Rollno;
		this.name = name;
		this.Department = Department;
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", name=" + name + ", Department=" + Department + ", semester=" + semester
				+ "]";
	}

}
