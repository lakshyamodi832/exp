package com.exp.six;

public class statKey {
    static void main() {
        stats s = new stats(69);
        s.display();
    }
}

class stats{
    int exp;
    static int stat = 12;

    stats(){

    }

    stats(int e){
        exp = e;
    }

    void display(){
        System.out.println(exp);
        System.out.println(stat);
    }
}
