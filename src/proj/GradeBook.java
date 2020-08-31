package proj;
import java.util.ArrayList; // import the ArrayList class

public class GradeBook {
	ArrayList<Integer> scores = new ArrayList<Integer>();
	String testName = "";
	//make an input function in other file? for user input of scores to pass to constructor
	public GradeBook(String testName, ArrayList<Integer> userScores) {
		setTestName(testName);
		setScores(userScores);
	}
	public GradeBook() {
		
	}
	public ArrayList<Integer> getScores() {
		return scores;
	}
	public void setScores(ArrayList<Integer> scores) {
		this.scores = scores;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	public ArrayList<String> setLetterGrades() {
		//make lettergrades arraylist which is the letter corresponding to number grade
		ArrayList<String> letterGrades = new ArrayList<String>();
		
		for(int i = 0; i < scores.size(); i++) {
			String letter = "";
			int score = scores.get(i);
			if (score >= 90){
				letter = "A";
			}
			else if(score >= 80) {
				letter = "B";
			}
			else if (score >= 70) {
				letter = "C";
			}
			else if (score >= 60) {
				letter = "D";
			}
			else {
				letter = "F";
			}
			letterGrades.add(letter);
		}
		return letterGrades;
	}
}
