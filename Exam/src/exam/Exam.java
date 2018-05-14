/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author duong
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while(true) {
            System.out.println("1: Add new student");
            System.out.println("2: Save");
            System.out.println("3: Display all student");
            System.out.println("4: Exit");
            int inp = Integer.parseInt(scanner.nextLine());
            switch(inp) {
                case 1: {
                    System.out.println("Enter EnrolID: ");
                    String roll = scanner.nextLine();
                    System.out.println("Enter FirstName: ");
                    String firstname = scanner.nextLine();
                    System.out.println("Enter LastName: ");
                    String lastname = scanner.nextLine();
                    System.out.println("Enter Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    Student student = new Student(roll, firstname, lastname, age);
                    list.add(student);
                    break;
                }
                case 2: {
                    try {
                        FileOutputStream f = new FileOutputStream(new File("C:\\Users\\duong\\Documents\\students.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
                        for (int i = 0; i < list.size(); i++) {
                            String roll = list.get(i).getEnrolID();
                            String firstname = list.get(i).getFirstName();
                            String lastname = list.get(i).getLastName();
                            int age = list.get(i).getAge();
                            Student students = new Student(roll, firstname, lastname, age);
                            o.writeObject(students);
                            o.close();
                            f.close();
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                   break;
                }
                case 3: {
                    try {
                        FileInputStream fi = new FileInputStream(new File("C:\\Users\\duong\\Documents\\students.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
                        Student pr1 = (Student) oi.readObject();
			System.out.println(pr1.toString());
                        oi.close();
			fi.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                   break;
                }
            }
            if(inp == 4) {
                break;
            }
        }
    }
}
