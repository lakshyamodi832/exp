package com.exp.five;

public class cOverload {
    static void main() {
        Student s1 = new Student();
        Student s2 = new Student("Lakshya");
        Student s3 = new Student(19);
        Student s4 = new Student("Lakshya", 19);
        Student s5 = new Student(19, "Lakshya");
    }
}

class Student{
    String name;
    int age;

    Student(){
        System.out.println("No details available!");
    }

    Student(int a){

        age = a;
        System.out.println("Age: " + age);
    }

    Student(int a, String n){
        name = n;
        age = a;
        System.out.println("Name: " + name + " & age: " + age);
    }

    Student(String n){
        name = n;
        System.out.println("Name: " + name);
    }

    Student(String n, int a){
        name = n;
        age = a;
        System.out.println("Name: " + name + " & age: " + age);
    }
}
