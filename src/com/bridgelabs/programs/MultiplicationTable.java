package com.bridgelabs.programs;
/*
 * @author Pooja Kakuru
 * Created date : 16-10-2020
 * Functionality: Program of multiplication table
 *                value taken bye user
 *
 */

import java.util.Scanner;

import com.bridgelabs.utility.Utilities;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to generate multiplication table :");
        int number= scanner.nextInt();
        Utilities utilities = new Utilities();
        int counter;
        for(counter=1;counter<=10;counter++){
            int result=utilities.mulTwoNumbers(counter,number);
            System.out.println(number+"*"+counter+"="+result);
        }
    }
}
