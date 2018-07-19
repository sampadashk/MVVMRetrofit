package com.example.unsan.mvvmretrofiteg.remote;

public class Student {
    String name;
    String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;

    }

    public Student() {
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
