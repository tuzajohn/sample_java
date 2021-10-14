package com.company;

public class Main {

    public static void main(String[] args) {
        StudentDataStore dataStore = new StudentDataStore();

        Student overAllStudentObject = new Student();

        Student studentOne = new Student("John", 34.4F, 20);
        Student studentTwo = new Student("Cera", 34.4F, 20);

        overAllStudentObject.AddStudent(studentOne);
        overAllStudentObject.AddStudent(studentTwo);


        var student = overAllStudentObject.GetStudent(1);
        System.out.println("Student Name: " + student.getName());
    }
}
