package com.exp.six;

public class accModifier {
    static void main() {
        Test t = new Test();

        System.out.println("public: " + t.var);
        System.out.println("protected: " + t._var);
        System.out.println("default: " + t.defVar);

        t.display();;
    }
}

class Test{
    public int var = 10;
    protected int _var = 20;
    int defVar = 30;
    private int priVar = 40;

    public void display(){
        System.out.println("public: " + var);
        System.out.println("protected: " + _var);
        System.out.println("default: " + defVar);
        System.out.println("private: " + priVar);
    }
}