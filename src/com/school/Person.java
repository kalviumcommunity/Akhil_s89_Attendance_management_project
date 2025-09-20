package com.school;

public class Person {
    private static int nextIdCounter=0;
    protected int id;
    protected String name;

    Person(String name){
        this.id=nextIdCounter++;
        this.name=name;
    };

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    void displayDetails(){
        System.out.println("ID: "+id+", Name: "+name);
    }

}
