package com.company;
import java.util.Scanner;
import static java.lang.System.out;

public class MenuClass {
    public static int menu(){
            int selection;
            Scanner input = new Scanner(System.in);
            out.println("-------------------------");
            out.println("Select operation to perform\n");
            out.println("1 - Addition");
            out.println("2 - Subtraction");
            out.println("3 - Multiplication");
            out.println("4 - Division");
            out.println("5 - Raise a number to (X) power \n[Context: 1st num is number to be raised, Second num is exponent]\n");
            out.print("Enter choice: ");
            selection = input.nextInt();
            return selection;
    }
}
