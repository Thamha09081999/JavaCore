package test;

import model.SetStudent;
import model.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class DemoTest {
    public static void main(String[] args) {
        SetStudent setStudent = new SetStudent();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{

            System.out.println("----------Menu---------");
            System.out.println(
                    "1. Add one student in list.\n" +
                    "2. Output list student.\n" +
                    "3. Remove one student in list.\n" +
                    "4. Arrange list student sorted name.\n" +
                    "5. Print student has score max.\n"
            );
            System.out.println("Please input choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                   setStudent.addStudent();
                    break;
                case 2:
                    setStudent.outputListStudent();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                default:
                    System.out.println("ReChoice option. We just have 12 choice");
            }


        }while (choice != 0);
    }
}
