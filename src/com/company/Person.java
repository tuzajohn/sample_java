package com.company;

public class Person {
    private float height;
    private String name;

    public void  setHeight(float height){
        this.height = height;
    }
    public float getHeight(){
        return this.height;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Person(){

    }

    public Person(float height, String name) {
        this.height = height;
        this.name = name;
    }

    public double GetHeightSq(Integer height){
        this.height =(float) Math.pow(height, 2);
        return this.height;
    }
}
