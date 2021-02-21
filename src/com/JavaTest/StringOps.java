package com.JavaTest;

import java.util.Scanner;

public class StringOps {

    static String str1, str2;
    static int strLen1, strLen2;

    public StringOps(String testStr1, String testStr2){
        str1 = testStr1;
        str2 = testStr2;
    }

    public static void stringOperation(int op){

        Scanner scan = new Scanner(System.in);

        switch(op){
            case 1:{
                System.out.println("Enter pos number to be searched in string 1");
                int pos1 = scan.nextInt();
                System.out.println("Enter pos number to be searched in string 2");
                int pos2 = scan.nextInt();

                StringOps.stringOperation(10);

                if(pos1<strLen1 && pos2<strLen2){
                    System.out.println("Char at pos " + pos1 + " in " + str1 + " is " + str1.charAt(pos1));
                    System.out.println("Char at pos " + pos2 + " in " + str2 + " is " + str2.charAt(pos2));
                }
                else if(pos1>=strLen1 && pos2<strLen2){
                    System.out.println("Position entered is greater than string 1 length");
                    System.out.println("Char at pos " + pos2 + " in " + str2 + " is " + str2.charAt(pos2));
                }
                else if(pos2>=strLen2 && pos1<strLen1){
                    System.out.println("Position entered is greater than string 2 length");
                    System.out.println("Char at pos " + pos1 + " in " + str1 + " is " + str1.charAt(pos1));
                }
                else
                    System.out.println("Positions entered are greater than both the strings");
                break;
            }
            case 2:{
                System.out.println("Result for Str1 compared to Str2 is " + str1.compareTo(str2));
                System.out.println("Result for Str2 compared to Str1 is " + str2.compareTo(str1));
                break;
            }
            case 3:{
                System.out.println("String 1 concatenates with String 2 " + str1.concat(str2));
                System.out.println("String 2 concatenates with String 1 " + str2.concat(str1));
                break;
            }
            case 4:{
                System.out.println("Does String 1 contains String 2 " + str1.contains(str2));
                System.out.println("Does String 2 contains String 1 " + str2.contains(str1));
                break;
            }
            case 5:{
                System.out.println("Enter ending check for String 1");
                String endCheck1 = scan.next();
                System.out.println("Enter ending check for String 2");
                String endCheck2 = scan.next();
                System.out.println("Does string 1 ends with " + endCheck1 + " " + str1.endsWith(endCheck1));
                System.out.println("Does string 2 ends with " + endCheck2 + " " + str2.endsWith(endCheck2));
                break;
            }
            case 6:{
                System.out.println("Are string 1 and string 2 equal when compared with case sensitivity? " + str1.equals(str2));
                break;
            }
            case 7:{
                System.out.println("Are string 1 and string 2 equal when compared without case sensitivity? " + str1.equalsIgnoreCase(str2));
                break;
            }
            case 8:{
                System.out.println("Enter substring");
                String substr = scan.next();
                System.out.println("Enter index after which substring needs to be searched");
                int index = scan.nextInt();
                int substrlen = substr.length();
                if(index<substrlen)
                    System.out.println("Index of substring after index " + index + " in String 1 is " + str1.indexOf(substr,index));
                System.out.println("Index of substring in String 2 is " + str2.indexOf(substr));
            }
            case 9: {
                System.out.println("Enter substring");
                String substr = scan.next();
                System.out.println("Enter index after which substring needs to be searched");
                int index = scan.nextInt();
                int substrlen = substr.length();
                if (index < substrlen)
                    System.out.println("Last Index of substring after index " + index + " in String 1 is " + str1.lastIndexOf(substr, index));
                System.out.println("Last Index of substring in String 2 is " + str2.lastIndexOf(substr));
            }
            case 10:{
                strLen1 = str1.length();
                strLen2 = str2.length();
                System.out.println("Length of String 1 is " + strLen1 + " and length of String 2 is " + strLen2);
                break;
            }
        }
    }

    public static void main(String [] args){

        String check;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String Operation Number");
        System.out.println("1. Char At");
        System.out.println("2. Compare To");
        System.out.println("3. Concat");
        System.out.println("4. Contains");
        System.out.println("5. Ends With");
        System.out.println("6. Equals");
        System.out.println("7. EqualsIgnoreCase");
        System.out.println("8. Index Of");
        System.out.println("9. Last Index Of");
        System.out.println("10. Length");
        System.out.println("11. Replace");
        System.out.println("12. Replace All");
        System.out.println("13. Split");
        System.out.println("14. Starts With");
        System.out.println("15. Substring");
        System.out.println("16. To Char Array");
        System.out.println("17. To Lower Case");
        System.out.println("18. To Upper Case");
        System.out.println("19. Trim");
        System.out.println("20. Value Of");

        do{
            System.out.println("Enter String Operation Number");
            int op = scan.nextInt();

            System.out.println("Enter String 1");
            String testStr1 = scan.next();
            System.out.println("Enter String 2");
            String testStr2 = scan.next();

            StringOps stringOps = new StringOps(testStr1, testStr2);
            StringOps.stringOperation(op);

            System.out.println("Want to check more operations ? (Y/N)");
            check = scan.next();
        }while(check.equalsIgnoreCase("Y"));
    }
}
