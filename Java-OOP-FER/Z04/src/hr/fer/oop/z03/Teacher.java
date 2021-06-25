package hr.fer.oop.z03;

public class Teacher extends Person {
	private String email;
	private String subject;
	private double salary;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Teacher(String name, String surname,int age, String email, String subject, double salary) {
		super(name, surname, age);
		this.email=email;
		this.subject=subject;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+email+", "+subject+", "+salary;
	}
	@Override
	public boolean equals(Object obj) {
		Teacher other = (Teacher) obj;
		return this.email.equals(other.email);
	}
	
	public void increaseSalary(int percentage) {
		this.salary=this.salary*(1+percentage/100.0);
	}
	public static void increaseSalary(int percentage, Teacher...teachers) {
		for(Teacher teacher:teachers) {
			teacher.salary=teacher.salary*(1+percentage/100.0);
		}
	}
}
