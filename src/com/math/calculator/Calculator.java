package com.math.calculator;

import java.util.Scanner;

public class Calculator {

    public double calc(double x, double y, String op){
        double res = 0;

        if(op.equalsIgnoreCase("Add"))
            res = x + y;
        else if(op.equalsIgnoreCase("Sub"))
            res = x - y;
        else if(op.equalsIgnoreCase("Mul"))
            res = x * y;
        else if(op.equalsIgnoreCase("Div"))
            res = x / y;
        else if(op.equalsIgnoreCase("Rem"))
            res = x % y;
        else
            System.out.println("Wrong Operator");

        return res;
    }

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first input");
        double a = scan.nextDouble();
        System.out.println("Enter second input");
        double b = scan.nextDouble();
        System.out.println("Enter operator");
        String optr = scan.next();

        Calculator cal = new Calculator();
        double res = cal.calc(a,b,optr);
        System.out.println("Result is " + res);

    }
}
