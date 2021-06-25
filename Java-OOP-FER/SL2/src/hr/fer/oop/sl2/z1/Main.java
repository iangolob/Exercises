package hr.fer.oop.sl2.z1;

public class Main {
	
	static void sortStudentsOnAge(Student[] students) {
		
		for(int i=0;i<students.length;i++) {
			for(int j=i+1;j<students.length;j++) {
				if(students[i].getAge()>students[j].getAge()) {
					//swap
					Student tempStudent;
					tempStudent=students[i];
					students[i]=students[j];
					students[j]=tempStudent;
				}
			}
		}
		
	}

	
	
	public static void main(String[] args) {
		
	}
}
