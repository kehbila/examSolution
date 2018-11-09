package za.co.examsolutions.test;

import java.util.Scanner;

import za.co.examsolutions.people.Student;
import za.co.examsolutions.people.Teacher;

public class Test {

    public static void main(String[] args) {

        System.out.println("Select 1 for Student or 2 for Teacher");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {

            System.out.println("press 1 to register or 2 to login");
            int loginRegisterOption = sc.nextInt();

            if (loginRegisterOption == 1) {

                System.out.println("Enter your age");
                int age = sc.nextInt();

                System.out.println("Enter your student number");
                int studentNumber = sc.nextInt();

                System.out.println("Enter your ID number");
                long idNumber = sc.nextLong();

                System.out.println("Enter your gender");
                String gender = sc.nextLine();

                System.out.println("Enter your student username");
                String username = sc.nextLine();

                System.out.println("Enter your password");
                String password = sc.nextLine();

                System.out.println(4567543);

                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                Student s = new Student();
                s.setAge(age);
                s.setGender(gender);
                s.setName(password);
                s.setStudentNumber(studentNumber);
                s.setUsername(username);
                s.setName(name);
                s.setIdNumber(idNumber);

            } else {
                System.out.println();
            }

        } else {

            System.out.println("press 1 to register or 2 to login");
            int loginRegisterOption = sc.nextInt();
            if (loginRegisterOption == 1) {
                System.out.println("Enter your name");
                String name = sc.nextLine();

                System.out.println("Enter your age");
                int age = sc.nextInt();

                System.out.println("Enter your ID number");
                long idNumber = sc.nextLong();

                System.out.println("Enter your gender");
                String gender = sc.nextLine();

                System.out.println("Enter your student username");
                String username = sc.nextLine();

                System.out.println("Enter your password");
                String password = sc.nextLine();

                Teacher t = new Teacher();
                t.setAge(age);
                t.setGender(gender);
                t.setName(password);
                t.setUsername(username);
                t.setName(name);
                t.setIdNumber(idNumber);
                sc.close();

            } else {
                System.out.println();
            }
        }

    }

}