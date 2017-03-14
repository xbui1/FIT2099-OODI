/**
 * Eric Jiang
 * 27849821
 */

package main;
import main.Unit;

import java.util.ArrayList;
import java.util.Scanner;

public class UniversityDriver {
    public ArrayList<Unit> units = new ArrayList<>();

    public void printStatus() {
        ArrayList<Unit> unitArray = new ArrayList<>();
        System.out.println("Welcome to Java University");

        createUnit("FIT1045", "Introduction to Saurabh");

        displayUnits(units);

        System.out.println("Thank you for using Java University");
    }

    public static void main(String[] args) {
        UniversityDriver universityDriver = new UniversityDriver();
        universityDriver.printStatus();
    }

    public void addUnits(Unit unit) {

    }

    public void createUnit(String unitCode, String unitName) {
        Unit unit = new Unit();
        unit.setUnitCode(unitCode);
        unit.setUnitName(unitName);
        unit.enrolStudents(314159265, "John", "Cena");
        units.add(unit);
    }

    public void displayUnits(ArrayList<Unit> units) {
        for(int i=0; i < units.size(); i++){
            Unit currentUnit = units.get(i);

            String unitCode = currentUnit.getUnitCode();
            String unitName = currentUnit.getUnitName();
            
            System.out.println("Unit Code " + unitCode + ", " + "Unit Name is " + unitName);
            currentUnit.displayStudents();
        }
    }
}