package entities;

public class Grade {

	public String name;
	public double note1, note2, note3, result;

	public double finalGrade() {
		result = note1 + note2 + note3;
		return result;
	}

	public String toString() {
		if (finalGrade() >= 60) {
			System.out.printf("FINAL GRADE = %.2f%nPASS", finalGrade());
		} else {
			double missing = (60.0 - result);
			System.out.printf("FINAL GRADE = %.2f%nFAILED \nMISSING %.2f POINTS", finalGrade(), missing);
		}
		return " ";

	}
}
