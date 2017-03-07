/**
 * Eric Jiang
 * 27849821
 */

package main;
import main.JavaUniversity;
import main.Unit;

import java.io.Console;
import java.util.Scanner;

public class UniversityDriver {
    public JavaUniversity javaUniversity;
    Unit[] units = new Unit[2];

    public void printStatus() {
        Unit[] unitArray = new Unit[3];
        System.out.println("Welcome to Java University");

        // create 3 units
        for(int i=1; i < 4; i++){
            createUnits();
        }

        displayUnits(units);

        System.out.println("Thank you for using Java University");
    }

    public static void main(String[] args) {
        UniversityDriver universityDriver = new UniversityDriver();
        universityDriver.printStatus();
    }

    public void addUnits(Unit unit) {

    }

    public void createUnits() {
        Unit unit = new Unit();

        Console console = System.console();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Unit Code:");
        String unitCode  = scan.next();
        System.out.println("Enter a Unit Name:");
        String unitName = scan.next();

        unit.setUnitCode(unitCode);
        unit.setUnitName(unitName);

        System.out.println(unit.getUnitCode());
        units[units.length-1]=unit;
    }

    public void displayUnits(Unit[] units) {
        for(int i=1; i < units.length; i++){
            Unit currentUnit = units[i];

            String unitCode = currentUnit.getUnitCode();
            String unitName = currentUnit.getUnitName();

            System.out.println("Unit Code " + unitCode + ", " + "Unit Name is " + unitName);
        }
    }
}
