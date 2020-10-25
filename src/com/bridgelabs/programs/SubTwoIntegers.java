package com.bridgelabs.programs;
/*
 * @author Pooja Kakuru
 * Created date : 16-10-2020
 * Functionality: Program to Subtract two integers
 *
 */
import java.util.Scanner;

import com.bridgelabs.utility.Utilities;

public class SubTwoIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstInteger = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondInteger = scanner.nextInt();

        Utilities utilities = new Utilities();
        int result = utilities.SubTwoIntegers(firstInteger,secondInteger);

        System.out.println("The Subtraction of two numbers is "+result);
        scanner.close();
    }
}

