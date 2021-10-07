package main;

import java.util.Scanner;

public class StringMethodExercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = "There as also s String Medoth - *replac First* replac the first occurrence of a substring that matches the given regular expression with the given replacement";


        //1- write a method to check the number of chars , it returns "Error message " if it exceeds 500 !!

        System.out.println(text);
        int length = text.length();
        System.out.println("Number of character: " + length);


        /** the return function doesn` work
         if (length() > 500)
         return "Error - only less than 500 characters are allowed";
         */

        //2- write a method to replace a specified char with another one only one char should be replaced

        char ch ='i';
        int pos = 6;

        text =text.substring(0,pos) +ch +text.substring(pos+1);
        System.out.println(text);

        //3- write a method to replace a specified char with another all occurrences should be replaced
        System.out.println(text);
        text = text.replace('*','"');
        System.out.println(text);

        //4- write a method to replace a phrase with new phrase one time only
        StringBuilder str = new StringBuilder(text);
        str.replace(23,29,"Method");
        System.out.println(str);


        //5-  write a method to replace a phrase with new phrase  all occurrences should be replaced
        text = text.replace("replac", "replaces");
        System.out.println(text);


        //6- write a method to delete a phrase from the text
        StringBuilder str1 = new StringBuilder(text);
        str1.delete(0,32);
        System.out.println(str1);

    }

}
