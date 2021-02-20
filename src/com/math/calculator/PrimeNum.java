package com.math.calculator;

import java.util.Scanner;

public class PrimeNum {

    int num;

    public void checkPosNeg(int n){
        num = n;
        if(num<0)
            System.out.println("Entered number is Negative and less than 0");
        else if(num>0){
            System.out.println("Entered number is Positive and can be verified for prime");
            checkPrime();
        }
        else
            System.out.println("Entered number is 0 which is neither prime nor composite");
    }

    public void checkPrime(){
        int count = 0;
        for(int i=2; i<num/2; i++){
            if(num%i == 0)
                count++;
        }
        if(count == 0)
            System.out.println("Entered number is a Prime Number");
        else
            System.out.println("Entered number is not a Prime Number");
    }

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scan.nextInt();

        PrimeNum pn = new PrimeNum();
        pn.checkPosNeg(n);
    }

}
