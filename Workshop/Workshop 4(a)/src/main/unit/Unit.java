package main.unit;

import java.util.ArrayList;

import main.Student;
import main.assessment.Assessment;

public class Unit {

    public String UnitCode;
    public String UnitName;
    public String UnitDescription;
    public ArrayList<Assessment> assesssments = new ArrayList<>();

    public ArrayList<Student> students = new ArrayList<>();
    
    public void displayStudents(){
    	if(students.size()>0){
    		for(int i=0; i < students.size(); i++){
        		Student student = students.get(i);

                String studentDescription = student.getDescription();
                System.out.println(studentDescription);
        	}
    	}
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}