package hr.fer.oop;

public class Student extends Person {
	private short academicYear;
	private int[] grades;
	public Student(int id,String name,short academicYear, int[] grades) {
		super(id,name);
		this.grades=grades;
		this.academicYear=academicYear;
	}
	public short getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(short academicYear) {
		this.academicYear = academicYear;
	}
	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		String gradeString= new String("");
		for(int i=0;i<grades.length;i++) {
			if(grades[i]!=0) {
				gradeString+=" "+Integer.toString(grades[i]);
			}else {
				break;
			}
		}
		return super.toString()+", year: "+academicYear+", grades:"+gradeString;
	}
	@Override
	public double getGrade() {
		double average=0;
		for(int grade:grades) {
			average+=grade;
		}
		average=average/grades.length;
		return average;
	}
}
