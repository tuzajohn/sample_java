package com.company;

import java.util.ArrayList;

public class StudentDataStore implements IGenericDataStore<Student> {

    private ArrayList<Student> studentArrayList;
    public  StudentDataStore(){
        studentArrayList = new ArrayList<>();

    }

    @Override
    public Student GetObject(int index) {
        return studentArrayList.get(index);
    }

    @Override
    public void AddObject(Student student) {
        this.studentArrayList.add(student);
    }

    @Override
    public ArrayList<Student> GetAll() {
        return studentArrayList;
    }
}
