package org.example;
import org.example.Service.CourseRegistration;
import org.example.Service.StudentRegistration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

//        System.out.print("Enter Student ID: ");
//        String id = jungkook.nextLine();
//        System.out.print("Enter Student Name: ");
//        String name = jungkook.nextLine();
//        System.out.print("Enter Course ID: ");
//        String cID = jungkook.nextLine();
//        System.out.print("Enter Course Name: ");
//        String cName = jungkook.nextLine();
//        System.out.print("Enter Program: ");
//        String prog = jungkook.nextLine();

        StudentRegistration sReg = new StudentRegistration();
        sReg.saveStudent();
        CourseRegistration cReg = new CourseRegistration();
        cReg.save();


    }
}
