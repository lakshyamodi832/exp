package com.exp.four;

public class string {
    static void main() {
        String s1 = "Hello ";
        String s2 = "World!";

        System.out.println("length: " + s1.length());

        System.out.println("Character at index 3: " + s1.charAt(3));

        System.out.println("Substring: " + s2.substring(1, 4));

        System.out.println("Index of r: " + s2.indexOf('r'));

        String s3 = s1 + s2;
        String s4 = s1.concat(s2);

        String s5 = s3 + "!";

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println("UpperCase: " + s3.toUpperCase());
        System.out.println("LowerCase: " + s3.toLowerCase());

    }
}
