package main;

import java.util.HashMap;

public class StudentCollection {
	public HashMap<Integer, Student> students = new HashMap<>();
    // HashMap is chosen as there is no order to compare the students against
    // other than their StudentIDs
	
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
     * 
     * @param students
     */
    public void displayStudents(HashMap<Integer, Student> students) {
        for(int i=0; i < students.size(); i++){
            Student currentStudent = students.get(i);

            String unitDescription = currentStudent.getDescription();
            System.out.println(unitDescription);
        }
    }
    
    /**
     * 
     * @param studentID
     * @return Student
     */
    public Student returnStudentInfo(Integer studentID){
    	return students.get(studentID);
    }

}
