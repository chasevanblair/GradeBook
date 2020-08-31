package proj;

import java.util.ArrayList;
import java.util.Scanner;

public class gradeMain {
	public static ArrayList<Integer> scoreInput(){
		//get amount of scores and scores before they are set to letters
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many scores to enter: ");
		int amount = input.nextInt();
		
		for(int i = 0; i < amount; i++) {
			System.out.print("Enter a score: ");
	        scores.add(input.nextInt());
		}
		
        input.close();
		return scores;
	}
	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter test name: ");
    	String name = in.next();
    	
    	ArrayList<Integer> rawScores = scoreInput();
    	GradeBook grades = new GradeBook(name, rawScores);
    	
    	ArrayList<String> letterGrades = grades.setLetterGrades();
    	
    	System.out.println("Score ---- Grade");
    	for (int i = 0; i < letterGrades.size(); i++) {
    		
    		System.out.println(rawScores.get(i) + " ---- " + letterGrades.get(i));
    	}
    	
    	in.close();
    	
    }
}
