package com.test.bean;

public class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void info(){
        System.out.println("name:"+getName());
    }
}
