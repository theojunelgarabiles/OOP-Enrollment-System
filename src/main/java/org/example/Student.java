package org.example;

public class Student {
    private String studentID;
    private String studentName;
    private String program;

    public Student(String studentID, String studentName, String program) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.program = program;
    }

    public String getStudentID() { return studentID; }
    public String getStudentName() { return studentName; }
    public String getProgram() { return program; }

    public void setName(String name) { this.studentName = name; }
    public void setStudentID(String ID) { this.studentID = ID; }
    public void setProgram(String program) { this.program = program; }

    @Override
    public String toString() {
        return "Student ID: " + studentID + "\nStudent Name: " + studentName + "\nProgram: " + program;
    }
}