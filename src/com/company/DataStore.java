package com.company;

public class DataStore implements IDataStore {
    public Student student;
    public DataStore(){
        student = new Student();

        student.setName("John Tuza");
        student.setAge(50);
    }
    @Override
    public String GetName() {
        return student.getName();
    }

    @Override
    public Integer GetAge() {
        return student.getAge();
    }
}
