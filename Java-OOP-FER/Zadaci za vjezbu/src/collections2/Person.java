package collections2;

public class Person {
	private String OIB;
	private String firstName;
	private String lastName;
	private int age;
	private String status;
	public String getOIB() {
		return OIB;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public Person(String oIB, String firstName, String lastName, int age,String status) {
		super();
		OIB = oIB;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.status=status;
	}
	@Override
	public String toString() {
		return String.format("(%s) %s %s",OIB,firstName,lastName);
	}
	
}
