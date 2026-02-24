package org.example.Service;
import org.example.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegistration {
    private ArrayList<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner (System.in);

    //Create
    public void saveStudent(){
        System.out.println("Enter Student ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter Student Name: ");
        String name = scanner.next();
        System.out.println("Enter Student Program: ");
        String program = scanner.next();
        studentList.add(new Student(id, name, program));
    }

    //Read
    public void displayAllStudent(){
        System.out.println(studentList);
    }

    //Update
    public void updateStudent (Student student){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentID() == (student.getStudentID())){

                System.out.println("Enter new ID: ");
                String id = scanner.nextLine();
                System.out.println("Enter new Course: ");
                String course = scanner.nextLine();
            }
        }
    }
    //Remove
    public String delete(Student student){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentID() == (student.getStudentID())){
                studentList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error";
    }
}
