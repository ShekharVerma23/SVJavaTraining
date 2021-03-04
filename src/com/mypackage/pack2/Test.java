package com.mypackage.pack2;

import com.mypackage.pack1.Child;
import com.mypackage.pack1.Parent;

import java.util.Scanner;

public class Test {

    Scanner scan = new Scanner(System.in);

    public void parentExecute(){

        String ans;
        int [] array = new int[0];
        int count=0,arrSize;

        //use of do while loop
        do{
            System.out.println("Enter size of array");
            arrSize = scan.nextInt();

            if(arrSize > 5)
                System.out.println("Enter array size from 2 - 5 only");
            else {
                array = new int[arrSize];
                break;
            }
        }while(arrSize>5);

        //use of do while loop
        do{
            if(count<arrSize){
                System.out.println("Enter array element");
                array[count] = scan.nextInt();
                System.out.println("Want to enter more (y/n) ?");
                ans = scan.next();
                count++;
            }
            else{
                System.out.println("Sorry cannot exceed maximum array limit");
                break;
            }
        }while(ans.equalsIgnoreCase("y"));

        //use of for each loop
        System.out.println("Entered array is: ");
        for(int arr: array){
            System.out.print(arr + " ");
        }

        System.out.println("\n");
        Parent p = new Parent(array);
        p.function();
    }

    public void childExecute(){

        System.out.println("Enter name");
        String name = scan.next();
        Child c = new Child(name);
        c.function();
    }

    public static void main(String [] args){

        Test test = new Test();

        System.out.println("Enter your choice of class to execute (Parent/Child)");
        String str = test.scan.next();

        if(str.equalsIgnoreCase("Parent"))
            test.parentExecute();
        else if (str.equalsIgnoreCase("Child"))
            test.childExecute();
        else
            System.out.println("Wrong class option chosen! Come back later");

    }
}
