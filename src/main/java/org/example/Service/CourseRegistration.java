package org.example.Service;
import org.example.Course;
import org.example.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistration {
    private ArrayList<Course> courseList = new ArrayList<>();
    private Scanner scanner = new Scanner (System.in);

    //Create
    public void save(){
        System.out.println("Enter Student Name: ");
        String name = scanner.next();
        System.out.println("Enter Student Course: ");
        String course = scanner.next();
        System.out.println("Enter Student Program: ");
        String program = scanner.nextLine();
        courseList.add(new Course(name, course, program));
    }

    //Read
    public void displayAll(){
        System.out.println(courseList);
    }

    //Update
    public void updateCourse(Course course){
        for(int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseID() == (course.getCourseID())){

                System.out.println("Enter new course ID: ");
                String id = scanner.nextLine();
                System.out.println("Enter new Course Name: ");
                String newCourse = scanner.nextLine();
            }
        }
    }
    //Remove
    public String delete(Course course){
        for(int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseID() == (course.getCourseID())){
                courseList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error";
    }
}
