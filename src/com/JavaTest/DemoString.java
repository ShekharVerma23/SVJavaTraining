package com.JavaTest;

public class DemoString {
    
    public static void main(String [] args){

        String first_Name = "Shekhar";
        String last_Name = "Verma";

        int firstName_Len = first_Name.length();
        int lastName_Len = last_Name.length();

        //use of for loop
        for(int i=0; i<firstName_Len; i++){
            System.out.print(first_Name.charAt(i));
        }
        System.out.println();

        //use of while loop
        int j=0;
        while(j<lastName_Len){
            System.out.print(last_Name.charAt(j));
            j++;
        }
        System.out.println();

        //concat
        System.out.println("Concatenated Name is " + first_Name.concat(last_Name));

        //lowercase
        System.out.println("Name in lowercase is " + first_Name.toLowerCase() + " " + last_Name.toLowerCase());

        //uppercase
        System.out.println("Name in uppercase is " + first_Name.toUpperCase() + " " + last_Name.toUpperCase());
    }
}
