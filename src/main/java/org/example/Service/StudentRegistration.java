package org.example.Service;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.Student;


public class StudentRegistration {
    private ArrayList<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void saveStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Program: ");
        String program = scanner.nextLine();
        studentList.add(new Student(id, name, program));
        System.out.println("Student saved successfully!\n");
    }

    public void displayAllStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
            System.out.println();
        }
    }

    public void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        String id = scanner.nextLine();
        for (Student s : studentList) {
            if (s.getStudentID().equals(id)) {
                System.out.print("Enter new Student Name: ");
                s.setName(scanner.nextLine());
                System.out.print("Enter new Program: ");
                s.setProgram(scanner.nextLine());
                System.out.println("Student updated successfully!\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    public void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        String id = scanner.nextLine();
        studentList.removeIf(s -> s.getStudentID().equals(id));
        System.out.println("Student removed (if existed).\n");
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("[1] Save Student");
            System.out.println("[2] Display Student");
            System.out.println("[3] Update Student");
            System.out.println("[4] Remove Student");
            System.out.println("[0] Back");
            System.out.print("Enter Student: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1 -> saveStudent();
                case 2 -> displayAllStudent();
                case 3 -> updateStudent();
                case 4 -> removeStudent();
            }
        } while (choice != 0);
    }
}