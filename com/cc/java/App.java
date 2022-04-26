package com.cc.java;

import java.util.Arrays;

public class App {
    
    public static void main(String[] args) {


    //    int[] intArr= new int[4];
    //    output("Arr:" + intArr);
    //    output("Array-Länge: " +intArr.length);

    //    output("1.Element: " + intArr[0]);

    //    intArr[0] = 1;
    //    intArr[1] = 2;
    //    intArr[2] = 3;
    //    intArr[3] = 4;

    //    output("1.Element: " + intArr[0]);
    //    output("2.Element: " + intArr[1]);
    //    output("3.Element: " + intArr[2]);
    //    output("4.Element: " + intArr[intArr.length - 1]);

        String[] strArr= {"Ich", "bin", "Rocky","der", "SuperStar"};
        // output("1.Element: " + strArr[0]);
        // output("2.Element: " + strArr[1]);
        // output("3.Element: " + strArr[2]);

        for (int i = 0; i < strArr.length; i++) {

            output(strArr[i]);
            
        }


            

    

        
     
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

