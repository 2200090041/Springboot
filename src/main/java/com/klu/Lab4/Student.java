package com.klu.Lab4;


import java.util.Date;

public class Student {
    private String studentId;
    private String name;
    private String gender;
    private int age;
    private Date dob;

    public Student(String studentId, String name, String gender, int age, Date dateOfBirth) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dob = dob;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dob = dateOfBirth;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
    }
}
