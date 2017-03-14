package main;

public class Student {
    public int StudentId;
    public String FirstName;
    public String Surname;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getDescription() {
        return StudentId + " - " + FirstName + " " + Surname;
    }

}
