package main;
import main.Student;

import java.util.ArrayList;

public class Unit {

    public String UnitCode;
    public String UnitName;
    public String UnitDescription;



    public ArrayList<Student> students;


    public void enrolStudents(Integer studentID, String firstName, String lastName ){
        Student student = new Student();

        student.setStudentId(studentID);
        student.setFirstName(firstName);
        student.setSurname(lastName);

        students.add(student);
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
        return UnitDescription;
    }

    public void setUnitDescription() {
        UnitDescription = getUnitCode() + getUnitName();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}