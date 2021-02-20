package com.math.calculator;

import java.util.Scanner;

public class OddEven {

    int num;

    public void checkStatus(int n){
        num = n;
        if(n%2 == 0)
            System.out.println("Number entered is Even");
        else
            System.out.println("Number entered is Odd");
    }

    public static void main(String [] args){

        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        OddEven status = new OddEven();
        status.checkStatus(n);
    }

}
