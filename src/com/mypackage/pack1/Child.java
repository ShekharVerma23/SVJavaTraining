package com.mypackage.pack1;

public class Child extends Parent{

    //default constructor
    public Child(){

    }

    //parameterized constructor
    public Child(String name){
        this.name = name;
    }

    //function overriding
    public void function(){

        char [] nameArray = name.toCharArray();
        int vowelCount = 0;
        char [] vowelArray = new char[name.length()];
        
        for(int i = 0; i < name.length(); i++){
          if(nameArray[i] == 'a' || nameArray[i] == 'e' || nameArray[i] == 'i' || nameArray[i] == 'o' || nameArray[i] == 'u'){
              vowelArray[vowelCount] = nameArray[i];
              vowelCount++;
          }
        }

        System.out.println("Total number of vowels in " + name + " are: " + vowelCount);
        System.out.println("Vowels in the " + name + " are: " + String.valueOf(vowelArray));

    }
}
