package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "none";
    Student(int r,String n){
        rollno = r;
        name =n;
    }
    static void change(){
        college = "CODE GYM";
    }
    void display(){
        System.out.println(rollno+""+name+" "+college);
    }
}

