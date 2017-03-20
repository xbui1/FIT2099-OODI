package main.unit;

import java.util.ArrayList;

import main.Student;
import main.assessment.Assessment;

public class Unit {

    public String UnitCode;
    public String UnitName;
    public String UnitDescription;
    public ArrayList<Assessment> assesssments = new ArrayList<>();

    public ArrayList<Integer> enrolledStudents = new ArrayList<>(); //this is an array of student IDs
    
    /**
     * @author Eric Jiang 
     */
    public void displayStudents(){
    	if(enrolledStudents.size()>0){
    		for(int i=0; i < enrolledStudents.size(); i++){
        		String student = enrolledStudents.get(i);
        		
        		// student should contain studentID
        		
        	}
    	}
    }
    
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
}