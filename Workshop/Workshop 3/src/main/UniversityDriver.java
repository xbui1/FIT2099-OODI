/**
 * Eric Jiang
 * 27849821
 */

package main;
import main.JavaUniversity;
import main.Unit;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class UniversityDriver {
    public ArrayList<Unit> units = new ArrayList<>();

    public void printStatus() {
        Unit[] unitArray = new Unit[3];
        System.out.println("Welcome to Java University");

        // create 3 units
        for(int i=1; i < 4; i++){
            createUnit();
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

    public void createUnit() {
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
        units.add(unit);
    }

    public void displayUnits(ArrayList<Unit> units) {
        for(int i=0; i < units.size(); i++){
            Unit currentUnit = units.get(i);

            String unitCode = currentUnit.getUnitCode();
            String unitName = currentUnit.getUnitName();

            System.out.println("Unit Code " + unitCode + ", " + "Unit Name is " + unitName);
        }
    }
}