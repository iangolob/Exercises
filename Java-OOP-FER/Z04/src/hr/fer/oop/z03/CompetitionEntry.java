package hr.fer.oop.z03;
public class CompetitionEntry {
	private Teacher teacher;
	private Dessert dessert;
	private Student[] students = new Student[3];
	private int[]	ratings = new int[3];
	
	
	public Teacher getTeacher() {
		return teacher;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public Student[] getStudents() {
		return students;
	}

	public int[] getRatings() {
		return ratings;
	}
	
	
	
	public CompetitionEntry(Teacher teacher,Dessert dessert) {
		this.teacher=teacher;
		this.dessert=dessert;
	}
	
	public boolean addRating(Student student, int rating) {
		for(int i=0;i<3;i++) {
			if(students[i]==null) {
				students[i]=student;
				ratings[i]=rating;
				return true;
			}else {
				if(students[i].getName().equals(student.getName())) {
					return false;
				}
			}
		}
		return false;
	}
	public double getRating() {
		double average=0.0;
		if(ratings.length>0) {
			for(int rating:ratings) {
			average+=rating;
		}
	}
		return average/3;
	}
}
