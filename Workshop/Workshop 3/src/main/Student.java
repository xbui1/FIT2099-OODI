package main;

public class Student {
    public int StudentId;
    public String FirstName;
    public String Surname;
    
    public int getStudentId() {
    	// int is used here as there can be an order, allowing it easier to be + 1
    	// advantages are that it has an order so that new students and can be sorted upon
    	// integers are also more easily sorted upon and hence faster, because inside a string
    	// there are many characters, it takes longer for an alogrithm to search through the string,
    	// 
    	// When comparing strings you have to compare one at a time, by using this integers you dramatically
    	// increase the speed of the comparisons.
    	//
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
