package com.example.Qns3;

public class MyClass {
    public static void main(String args[]) {
        ComplexNum c1 = new ComplexNum(20, -4);
        ComplexNum c2 = new ComplexNum(3, 2);
        ComplexNum temp = new ComplexNum();

        System.out.println("First Complex Num: " + c1);
        System.out.println("Second Complex Num: " + c2);

        // Addition
        temp = Operations.add(c1, c2);
        System.out.println(temp);

        // Subtraction
        temp = Operations.subtract(c1, c2);
        System.out.println(temp);

        // Multiplication
        temp = Operations.multiply(c1, c2);
        System.out.println(temp);

        // Division
        temp = Operations.divide(c1, c2);
        System.out.println(temp);
    }
}