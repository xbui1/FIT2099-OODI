package main.unit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import main.assessment.Assessment;
import main.assessment.Assignment;
import main.assessment.Exam;
import tools.Tools;

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
	
	/**
	 * Adds an Assessment to Assessment Scheme
	 * @param assessment
	 */
	public void addAssessment(Assessment assessment){
		if(assessment.getWeight() + totalWeighting > 100){
			assessmentList.add(assessment);
		}
	}
	
	/**
	 * Loop to Add Assessment to assessmentList
	 */
	public void assessmentsAdder(){
		while(totalWeighting < 100){
			System.out.println(totalWeighting);
			Integer assessmentType = Tools.readInt("Enter integer for type of assessment to enter (1 - Exam, 2 - Assignment): ");	
			Integer weighting = Tools.readInt("Enter percentage weighting of this assessment: ");
			String description = Tools.readString("Enter description of assessment: ");
			if(assessmentType == 1){
				Exam exam = new Exam();
				Integer duration = Tools.readInt("Enter duration of exam: ");
				exam.setDescription(description);
				exam.setDuration(duration);
				exam.setWeight(weighting);
				totalWeighting = totalWeighting + weighting;
				addAssessment(exam);
			} else if(assessmentType == 2){
				Assignment assignment = new Assignment();
				String title = Tools.readString("Enter title of this assessment: ");
				assignment.setTitle(title);
				assignment.setDescription(description);
				assignment.setWeight(weighting);
				totalWeighting = totalWeighting + weighting;
			} 
		}
	}
	

}
