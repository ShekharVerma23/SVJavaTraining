package com.mypackage.pack1;

import java.util.Arrays;

public class Parent {

    //Private Members
    private static int num;
    protected String name;
    protected int [] array;

    //default constructor
    public Parent(){

    }

    //parameterized constructor
    public Parent(int [] array){
        this.array = array;
    }

    //setters and getters for num
    public int getNum() {
        return num;
    }

    //setter and use of this keyword
    public void setNum(int num) {
        this.num = num;
    }

    public void function(){
        ArrayFunctions arr = new ArrayFunctions();
        arr.arrAverage(array);
        arr.arrLargest(array);
        arr.secondLargest(array);
    }
}

class ArrayFunctions {

    Parent p = new Parent();

    public void arrAverage(int [] array){
        p.setNum(array.length); //using the setters to set the private element
        int sum = 0;
        //use of for loop
        for(int i = 0; i < p.getNum(); i++){
            sum+=array[i];
        }
        System.out.println("Average of the elements in array is: " + (sum/p.getNum()));
    }

    public int [] sortArray(int [] array){
        Arrays.sort(array);
        return array;
    }
    public void arrLargest(int [] array){

        ArrayFunctions af = new ArrayFunctions();
        array = af.sortArray(array);
        System.out.println("Largest element of the array is: " + array[p.getNum()-1]);
    }

    public void secondLargest(int [] array){
        ArrayFunctions af = new ArrayFunctions();
        array = af.sortArray(array);
        System.out.println("Second largest element of the array is: " + array[p.getNum()-2]);
    }
}
