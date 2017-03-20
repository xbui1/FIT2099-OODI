package main.unit;

import java.util.ArrayList;

import main.assessment.Assessment;

public class AssessmentScheme {
	public int totalWeighting;
	public ArrayList<Assessment> assessments;
	
	public int getTotalWeighting() {
		return totalWeighting;
	}
	public void setTotalWeighting(int totalWeighting) {
		this.totalWeighting = totalWeighting;
	}
	public ArrayList<Assessment> getAssessments() {
		return assessments;
	}
	public void setAssessments(ArrayList<Assessment> assessments) {
		this.assessments = assessments;
	}
	
}
