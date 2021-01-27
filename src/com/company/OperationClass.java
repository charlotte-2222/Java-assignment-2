package com.company;
import java.util.Scanner;
import static java.lang.System.out;
public class OperationClass {
    public static void add(double numA, double numB){
        double answer = numA + numB;
        out.println(answer);


    }
    public static void sub(double numA, double numB){
        double answer = numA - numB;
        out.println(answer);
    }
    public static void multi(double numA, double numB){
        double answer = numA * numB;
        out.println(answer);
    }
    public static void div(double numA, double numB){
        double answer = numA / numB;
        out.println(answer);
    }





    public static int menu() {
        int selection;
        Scanner input = new Scanner(System.in);
        out.println("-------------------------");
        out.println("Select operation to perform\n");
        out.println("1 - Addition");
        out.println("2 - Subtraction");
        out.println("3 - Multiplication");
        out.println("4 - Division");
        out.print("Enter choice: ");
        selection = input.nextInt();
        return selection;
    }
}
