package com.company;

public class Student extends Person {
    private Integer Age;

    public void setAge(Integer age){
        this.Age = age;
    }

    public Integer getAge(){
        return this.Age;
    }

    private IGenericDataStore<Student> studentIGenericDataStore;
    public Student(){
        studentIGenericDataStore = new GenericDataStore<>();
    }

    public Student(String name, float height, Integer age){
        this.Age = age;
        this.setHeight(height);
        this.setAge(age);
        this.setName(name);

    }

    public void AddStudent(Student student){
        studentIGenericDataStore.AddObject(student);
    }

    public Student GetStudent(Integer index){
        return studentIGenericDataStore.GetObject(index);
    }

    @Override
    public double GetHeightSq(Integer height){
        System.out.println("Going to square the height");
        height = height + 3;
        return super.GetHeightSq(height);
    }
}
