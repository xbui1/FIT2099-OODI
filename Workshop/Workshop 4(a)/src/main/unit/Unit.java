package main.unit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import main.Student;
import main.assessment.Assessment;

public class Unit {

    public String UnitCode;
    public String UnitName;
    public String UnitDescription;

    public ArrayList<Integer> enrolledStudents = new ArrayList<>(); //this is an array of student IDs
    
    public AssessmentScheme assessmentScheme;
    
    /**
     * Get a list of students who are currently enrolled in the unit
     * @return ArrayList of Student IDs which are currently enrolled in the unit
     */
    public ArrayList<Integer> getEnrolledStudents(){
    	return enrolledStudents;
    }
    
    
    /**
     * Adds the Student ID to  the Unit Enrolment Array
     * @param student - A Student Object
     */
    public void addStudent(Student student){
    	enrolledStudents.add(student.getStudentId());
    }
    
    public String getUnitCode() {
        return UnitCode;
    }

    public void setUnitCode(String unitCode) {
        UnitCode = unitCode;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getUnitDescription() {
        return UnitCode + " - " + UnitName;
    }
    
    /**
     * Sets the Assessment Scheme of the Unit
     */
    public void setAssessment(){
    	AssessmentScheme assessmentToAdd = new AssessmentScheme();
    	
    }
    
    /**
     * Asks the user for input using prompt and returns it
     * @param prompt - message to tell student
     * @return output String
     */
    private String readString(String prompt){
    	System.out.print(prompt);
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	String outputString = null;
    	try {
    		outputString = in.readLine();
    	} catch (IOException e){
    		e.printStackTrace();
    	}
    	return outputString;
    }
}