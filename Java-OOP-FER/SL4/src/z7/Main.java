package z7;

public class Main {
	public static void main(String[] a) {
		Solution stat = new Solution();
		stat.addStudentScores("Luka", 4, 1, 2);
	     stat.addStudentScores("Luka", 1, 4);
	     stat.addStudentScores("Muto", 1);
	     System.out.println(stat.getInsertionOrderedStudents());
	     System.out.println(stat.getNaturallySortedPointsForStudent("Luka"));
	}
}
