/**
 * 	Verdict : Accepted
 *  This class was the actual task of the problem
 * @author absakDev
 *
 */
class Student extends Person{
	private int[] testScores;
	
	public Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		testScores = scores;
	}
	
	public char calculate() {
		char grade = ' ';
		int avg, sum = 0;
		int numOfScores = testScores.length;
		for (int i = 0; i < numOfScores; i++) {
			sum += testScores[i];
		}
		avg = sum / numOfScores;
		if(avg >= 90 && avg <= 100) {
			grade = 'O';
		} else if (avg >= 80 && avg < 90) {
			grade = 'E';
		} else if (avg >= 70 && avg < 80) {
			grade = 'A';
		} else if (avg >= 55 && avg < 70) {
			grade ='P';
		} else if (avg >= 40 && avg < 55) {
			grade = 'D';
		} else if (avg < 40) {
			grade ='T';
		}
		return grade;
	}
}