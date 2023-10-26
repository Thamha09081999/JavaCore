package model;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class SetStudent {
    //Attribute
    public Set <Student> listStudent = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    public SetStudent(){

    }
    public void addStudent(){
        listStudent.add(inputStudent());
    }

    public Student inputStudent(){
        System.out.println("Please enter id of student: ");
        String id = sc.nextLine();
        System.out.println("Please enter name of student: ");
        String name = sc.nextLine();
        System.out.println("Please enter age of student: ");
        int age = sc.nextInt();
        System.out.println("Please enter score of student: ");
        float score = sc.nextFloat();
        Student s = new Student(id, name, age, score);
        return s;
    }
    public void outputListStudent(){
        for (Student s: listStudent) {
            System.out.println(super.toString());
        }
    }


}
