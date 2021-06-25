package hr.fer.oop.z03;

public class Student extends Person {
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public short getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(short academicYear) {
		this.academicYear = academicYear;
	}
	private String studentId;
	private short academicYear;
	public Student(String name, String surname,int age,String studentId,short academicYear) {
		super(name, surname,age);
		this.studentId=studentId;
		this.academicYear=academicYear;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+studentId+", "+academicYear;
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.studentId.equals(other.studentId);
	}
	
	
}
