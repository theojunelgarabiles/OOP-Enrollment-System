package org.example.Service;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.Course;


public class CourseRegistration {
    private ArrayList<Course> courseList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void save() {
        System.out.print("Enter Course ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Program: ");
        String program = scanner.nextLine();
        courseList.add(new Course(id, name, program));
        System.out.println("Course saved successfully!\n");
    }

    public void displayAll() {
        if (courseList.isEmpty()) {
            System.out.println("No courses found.\n");
            return;
        }
        for (Course c : courseList) {
            System.out.println(c);
            System.out.println();
        }
    }

    public void updateCourse() {
        System.out.print("Enter Course ID to update: ");
        String id = scanner.nextLine();
        for (Course c : courseList) {
            if (c.getCourseID().equals(id)) {
                System.out.print("Enter new Course Name: ");
                c.setCourseName(scanner.nextLine());
                System.out.print("Enter new Program: ");
                c.setProgram(scanner.nextLine());
                System.out.println("Course updated successfully!\n");
                return;
            }
        }
        System.out.println("Course not found.\n");
    }

    public void removeCourse() {
        System.out.print("Enter Course ID to remove: ");
        String id = scanner.nextLine();
        courseList.removeIf(c -> c.getCourseID().equals(id));
        System.out.println("Course removed (if existed).\n");
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("[1] Save Course");
            System.out.println("[2] Display All Courses");
            System.out.println("[3] Update Course");
            System.out.println("[4] Remove Course");
            System.out.println("[0] Back");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1 -> save();
                case 2 -> displayAll();
                case 3 -> updateCourse();
                case 4 -> removeCourse();
            }
        } while (choice != 0);
    }
}