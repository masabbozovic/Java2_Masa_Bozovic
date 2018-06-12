package main;

import computer.Computer;
import course.Course;
import student.Student;

public class Main {

    public static void main(String[] args) {

        
        Student student1 = new Student();
        student1.info();
        
        Student student2 = new Student("Marina", "Markovic", 1980);
        student2.info();
        
        Course courseQA = new Course("QA kurs", 35);
        courseQA.info();
        
        Computer computer1 = new Computer(3.4, 8, 250);
        computer1.info();
        
        Student student3 = new Student("Masa", "Bozovic", 1984, courseQA, computer1);
        student3.info();
        
    }

}
