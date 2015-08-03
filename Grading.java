package com.digitek.StudentGrade;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalGrading();
	}

	public static void FinalGrading() {
		int points = 92;
		String Grade;
		
		if(points<=90 || points>=100){
		Grade = "A" + "Excellent"; 
		} else if (points>=80 || points<=89){
		Grade = "B" + "Above Average"; 
		} else if(points>=70 || points<=79){
		Grade = "C" + "Average"; 
		} else if(points>=60 || points<=69){
		Grade = "D" + "Below Average"; 
		} else 
		Grade = "F" + "Failed";
		}

		System.out.println ("Student grade is: " + points);
	
}


