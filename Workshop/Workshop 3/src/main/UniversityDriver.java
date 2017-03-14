/**
 * Eric Jiang
 * 27849821
 */

package main;
import main.Unit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UniversityDriver {
    public ArrayList<Unit> units = new ArrayList<>();

    public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println("Java University v0.0.1");
        
        int numberOfUnits = readInt("Enter number of units to add: ");
        for(int i=0; i < numberOfUnits; i++){
        	String unitCode = readString("Enter Unit Code");
        	String unitName = readString("Enter Unit Name");
        	createUnit(unitCode, unitName);
        }
        displayUnits(units);

        System.out.println("Thank you for using Java University");
    }

    public static void main(String[] args) {
        UniversityDriver universityDriver = new UniversityDriver();
        universityDriver.printStatus();
    }

    /**
     * createUnit
     * adds a unit
     * @param unitCode
     * @param unitName
     */
    public void createUnit(String unitCode, String unitName) {
        Unit unit = new Unit();
        unit.setUnitCode(unitCode);
        unit.setUnitName(unitName);
        
        int numberOfStudents = readInt("Enter number of students to add: ");
        for(int i=0; i < numberOfStudents; i++){
        	int studentID = readInt("Enter student code: ");
            String name = readString("Enter Student Name: ");
            String surname = readString("Enter Student Surname: ");	
            unit.enrolStudents(studentID, name, surname);
        }
        units.add(unit);
    }

    public void displayUnits(ArrayList<Unit> units) {
        for(int i=0; i < units.size(); i++){
            Unit currentUnit = units.get(i);

            String unitDescription = currentUnit.getUnitDescription();
            
            System.out.println(unitDescription);
            currentUnit.displayStudents();
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