package com.bridgelabs.utility;
/*
 * @author Pooja Kakuru
 * Created date : 16-10-2020
 * Functionality: This is a utility file which contains the
 *                logic of all codes that is written in the
 *                src folder
 *
 */
public class Utilities {
    /*
    * Functionality: This method contains the logic of two
    *                integers
    * @param firstInteger - First input argument that is taken
    * @param secondInteger - second input argument that is taken
    * @return Result
    */

    public int addTwoIntegers(int firstInteger,int secondInteger){
        int result;
        result = firstInteger + secondInteger;
        return result;

    }
    /*
     * Functionality: This method contains the logic of two
     *                integers
     * @param firstInteger - First input argument that is taken
     * @param secondInteger - second input argument that is taken
     * @return Result
     */

    public int SubTwoIntegers(int firstInteger,int secondInteger){
        int result;
        result = firstInteger - secondInteger;
        return result;

    }
    /*
     * Functionality: This method contains the logic of multiplication
     *                table
     * @param number - number is taken by user
     * @param counter- counter value increases upto 10
     * @return Result
     */
    public int mulTwoNumbers(int number,int counter){
        int result;
        result = number * counter;
        return result;
    }
    public int SingleDigitRandomNumber() {

        return (int) (Math.floor(Math.random() *10) % 10);
    }
    /**
     * Functionality : This function computes number of
     *                 times head flips, and tail flips
     *                 until either of them reaches
     *                 defined limit for FlipCoin program
     * @param limit  - Input given from the object
     *                 in the main function
     */

    public static int Flip(int limit) {
        int countofhead = 0, countoftail = 0;

        while (countofhead < limit && countoftail < limit) {
            int  CoinFlip = (int) GenerateRandom();
            if (CoinFlip == 0 ) {
                //" coin flips head"
                countofhead = countofhead + 1;
            }
            else {
                //" coin flips tail"
                countoftail = countoftail + 1;
            }

        }
        System.out.println("number of times head won" +countofhead);
        System.out.println("number of times tail won" +countoftail);
        return 0;
    }
}

