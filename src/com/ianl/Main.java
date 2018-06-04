package com.ianl;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(0, 12); // pass
        calcFeetAndInchesToCentimeters(-1, 12); // fail
        calcFeetAndInchesToCentimeters(0, 13); // fail
        calcFeetAndInchesToCentimeters(24, 12); // pass
    }

    public static int calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <=12)) {
            System.out.println("Validated with: "+feet+" ft "+inches+" in ");
            return 0;
        }
        return -1;
    }
}

// Create a method called calcFeetAndInchesToCentimeters
// needs to take in two parameters
// feet is the first, inches the second

// validate first parameter >= 0
// validate second to be >=0 and<=12
// return -1 if neither is not true

// if valid, calculate how many centimeters comprise the
// feet and inches passed to the method and return that value

// second method w/ the same name but only accepts inches as parameter
// validate that inches are >= 0, return -1 if not true
// if valid, calculate how many feet are in the inches
// call the other method to calculate how many centimeters are in the value
// use double as data types
// 1 inch = 2.54cm, 1 foot = 12 inches