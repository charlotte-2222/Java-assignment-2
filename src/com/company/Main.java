package com.company;
import javax.swing.*;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        do {
            try {
                String fullName;
                double numA, numB;

                Scanner input = new Scanner(in);
                out.print("------------------\n");

                out.print("Enter your full name: ");
                fullName = input.nextLine();

                out.print("\nEnter your first number: ");
                numA = input.nextInt();


                out.print("\nEnter your second number: ");
                numB = input.nextInt();

                int userChoice = MenuClass.menu();
                switch (userChoice) {
                    case 1 -> OperationClass.add(numA,
                            numB, fullName);
                    case 2 -> OperationClass.sub(numA,
                            numB, fullName);
                    case 3 -> OperationClass.multi(numA,
                            numB, fullName);
                    case 4 -> OperationClass.div(numA,
                            numB, fullName);
                    case 5 -> OperationClass.power(numA,
                            numB, fullName);
                }


                out.println("\nRun the program again?");
                out.print("Y/N: ");
                String loop = input.next();
                if (loop.equalsIgnoreCase("n")) {
                    if (JOptionPane.showConfirmDialog(null,
                            "Sure?",
                            "Warning",
                            JOptionPane.YES_NO_OPTION) ==
                            JOptionPane.YES_OPTION) {
                        exit(0);
                    }
                }
            } catch (Exception e) {infoBox("e", ""); }
        } while (true);}

    public static void infoBox(String s, String s1) {
        JOptionPane.showMessageDialog(null, s, "Oops..." +
                s1, JOptionPane.INFORMATION_MESSAGE);}
}
