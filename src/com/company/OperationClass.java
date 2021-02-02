package com.company;
import java.util.Scanner;
import static java.lang.System.out;
public class OperationClass {
    public static void add(double numA, double numB, String fullName){
        double answer = numA + numB;
        out.println("Here, " + fullName + "\nTotal: " + answer);
    }
    public static void sub(double numA, double numB, String fullName){
        double answer = numA - numB;
        out.println("Here, " + fullName + "\nTotal: " + answer);
    }
    public static void multi(double numA, double numB, String fullName){
        double answer = numA * numB;
        out.println("Here, " + fullName + "\nTotal: " + answer);
    }
    public static void div(double numA, double numB, String fullName){
        double answer = numA / numB;
        out.println("Here, " + fullName + "\nTotal: " + answer);
    }

    public static void power(double numA, double numB, String fullName){
        double answer = Math.pow(numA, numB);
        out.println("Here, " + fullName +"\nTotal: "+answer);
    }

}
