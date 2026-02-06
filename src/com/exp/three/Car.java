package com.exp.three;

public class Car {
    String name;
    String color;

    public Car(String n, String c){
        name  = n;
        color = c;
    }

    public void out(){
        System.out.println("The " + color + " " + name + " is on!");
    }

    static void main() {
        Car c1 = new Car("Venue", "Black");
        c1.out();
    }
}
