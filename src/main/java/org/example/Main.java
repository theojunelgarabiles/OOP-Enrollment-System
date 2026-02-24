package org.example;
import java.util.Scanner;
import org.example.*;
import org.example.Service.CourseRegistration;
import org.example.Service.StudentRegistration;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRegistration studentReg = new StudentRegistration();
        CourseRegistration courseReg = new CourseRegistration();

        int choice;
        do {
            System.out.println("=== Enrollment System ===");
            System.out.println("[1] Student Registration");
            System.out.println("[2] Course Registration");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1 -> studentReg.showMenu();
                case 2 -> courseReg.showMenu();
                case 0 -> System.out.println("Goodbye!");
            }
        } while (choice != 0);
    }
}