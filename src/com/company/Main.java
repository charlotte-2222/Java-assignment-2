package com.company;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args){
        String fname, lname;
        double numA, numB;
        Scanner input = new Scanner(in);
        out.println("------------------");
        out.print("Enter your first name: ");
        fname = input.next();
        out.print("\nEnter your last name: ");
        lname = input.next();
        out.print("\nEnter your first number: ");
        numA = input.nextInt();
        out.print("\nEnter your second number: ");
        numB = input.nextInt();

        int userChoice = OperationClass.menu();
        switch (userChoice) {
            case 1 -> OperationClass.add(numA, numB);
            case 2 -> OperationClass.sub(numA, numB);
            case 3 -> OperationClass.multi(numA, numB);
            case 4 -> OperationClass.div(numA, numB);
        }
    }
}
