package main.unit;

import java.util.ArrayList;

import main.assessment.Assessment;

public class AssessmentScheme {
	public int totalWeighting;
	public ArrayList<Assessment> assessmentList;
	
	public int getTotalWeighting() {
		return totalWeighting;
	}
	public void setTotalWeighting(int totalWeighting) {
		this.totalWeighting = totalWeighting;
	}
	public ArrayList<Assessment> getAssessmentList() {
		return assessmentList;
	}
	public void setAssessmentList(ArrayList<Assessment> assessmentList) {
		this.assessmentList = assessmentList;
	}
	
	public void addAssessment(Assessment assessment){
		assessmentList.add(assessment);
	}
}
