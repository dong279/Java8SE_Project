package mylab.student.exception;

public class InvalidGradeException extends Exception{
	private int currentGrade;
	
	public InvalidGradeException(String errorMessage, int currentGrade) {
		super(errorMessage);
		this.currentGrade = currentGrade;
	}
	 public int currentGrade() {
		return currentGrade;
	}
}
