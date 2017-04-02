/**
 * Eric Jiang
 * 27849821
 */

package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import main.unit.Unit;

public class University {
	
    public ArrayList<String> unitCodeList = new ArrayList<>();
    public HashMap<String, Unit> units = new HashMap<>();
    
    public HashMap<Integer, Student> students = new HashMap<>();
    
    // HashMap is chosen as there is no order required to compare the students against
    // other than their StudentIDs, it also has better time complexity.
    
    public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println("Java University v0.4.0");

        int numberOfStudents = readInt("Enter number of students to add: ");
        for(int i=0; i < numberOfStudents; i++){
        	
        	Integer studentID = readInt("Enter Student ID: ");
        	String firstName = readString("Enter Student's Firstname: ");
        	String surname = readString("Enter Student's Surname: ");
        	admitStudents(studentID, firstName, surname);
        }
        
        int numberOfUnits = readInt("Enter number of units to add: ");
        addUnits(numberOfUnits);
        
        displayUnits(units);

        System.out.println("Thank you for using Java University.");
    }


	/**
	 * 
	 * @param numberOfLoops - Number of Units
	 */
    public void addUnits(Integer numberOfLoops){
    	for(int i=0; i < numberOfLoops; i++){
        	String unitCode = readString("Enter Unit Code: ");
        	String unitName = readString("Enter Unit Name: ");
        	unitCodeList.add(unitCode);
        	createUnit(unitCode, unitName);
            int numberOfStudentsUnit = readInt("Enter number of students to enrol: ");
            for(int k=0; k < numberOfStudentsUnit; k++){
                int studentID = readInt("Enter Student ID to add: ");
        		Student student = students.get(studentID);
        		if (student != null) {
        			enrolStudent(unitCode, student);
        		} else {
        			String errorMessage = "Invalid Student ID.";
        	        System.err.println(errorMessage);
        		}
            	
            }
        }
    }
    /**
     * admitStudents
     * Adds a Student to the students array
     * @param studentID
     * @param firstName
     * @param lastName
     */
    public void admitStudents(Integer studentID, String firstName, String lastName ){
        Student student = new Student();
        student.setStudentId(studentID);
        student.setFirstName(firstName);
        student.setSurname(lastName);
        students.put(studentID, student);
    }
    
    /**
     * Creates a Unit
     * adds a unit
     * @param unitCode
     * @param unitName
     */
    public void createUnit(String unitCode, String unitName) {
        Unit unit = new Unit();
        unit.setUnitCode(unitCode);
        unit.setUnitName(unitName);
        unit.setAssessment();
        units.put(unitCode, unit);
    }
    
    /**
     * Enrols a Students
     * @param UnitCode
     * @param student
     */
    public void enrolStudent(String unitCode, Student student){
		Unit unit = units.get(unitCode);
		if (unit != null) {
			unit.addStudent(student);
		}
    }
    
    
    /**
     * Displays Students
     * @param students
     */
    public void displayStudents(ArrayList<Student> students) {
        for(int i=0; i < students.size(); i++){
            Student currentStudent = students.get(i);
            String unitDescription = currentStudent.getDescription();
            System.out.println(unitDescription);
        }
    }
    
    public void displayUnits(HashMap<String, Unit> units) {
        for(int i=0; i < unitCodeList.size(); i++){
            String currentUnitCode = unitCodeList.get(i);
            Unit unit = units.get(currentUnitCode);
            System.out.println(unit.getUnitDescription());
        	System.out.println("-----------------------------");
            
            ArrayList<Integer> enrolledStudents = unit.getEnrolledStudents();
            for(int j=0; j < enrolledStudents.size(); j++){
            	Integer currentStudentID = enrolledStudents.get(j);
            	Student currentStudent = students.get(currentStudentID);
            	System.out.println(currentStudent.getDescription());
            }
        	System.out.println("-----------------------------");
        }
    }
    
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
    
    private int readInt(String prompt){
    	System.out.print(prompt);
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	int outputString = 0;
    	try {
    		outputString = Integer.parseInt(in.readLine());
    		
    	} catch (IOException e){
    		e.printStackTrace();
    	}
    	return outputString;
    }
}