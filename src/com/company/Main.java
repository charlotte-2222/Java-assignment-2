package com.company;
import javax.swing.*;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.System.in;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        try {
            do {

                double numA, numB;
                Scanner input = new Scanner(in);
                out.println("------------------");
                out.print("Enter your full name: ");
                String fullName = input.nextLine();
                out.print("\nEnter your first number: ");
                numA = input.nextInt();
                out.print("\nEnter your second number: ");
                numB = input.nextInt();

                int userChoice = OperationClass.menu();
                switch (userChoice) {
                    case 1 -> OperationClass.add(numA, numB, fullName);
                    case 2 -> OperationClass.sub(numA, numB, fullName);
                    case 3 -> OperationClass.multi(numA, numB, fullName);
                    case 4 -> OperationClass.div(numA, numB, fullName);
                }

                out.println("one mo' gin?");
                out.print("Y/N: ");
                String loop = input.next();
                if(loop.equalsIgnoreCase("n")){
                    if(JOptionPane.showConfirmDialog(null,
                            "Sure?",
                            "Warning",
                            JOptionPane.YES_NO_OPTION)==
                    JOptionPane.YES_OPTION){
                        exit(0);
                    }
                }

            }while(true);

        }catch (Exception e){
            infoBox("Oh oops :O", "");
        }

    }
    public static void infoBox(String s, String s1){

        JOptionPane.showMessageDialog(null, s, "Oops..." +
                s1, JOptionPane.INFORMATION_MESSAGE);
    }
}
