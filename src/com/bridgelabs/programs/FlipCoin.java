package com.bridgelabs.programs;
/*
 * @author Pooja Kakuru
 * Created date : 16-10-2020
 * Functionality: Program of FlipCoin
 *                value taken by user
 *
 */

import com.bridgelabs.utility.FlipCoinObject;

import com.bridgelabs.utility.Utilities;
public class FlipCoin {
    public static void main(String[] args){
        System.out.println("welcome to coin flip program");
        Utilities utilities = new Utilities();
        FlipCoinObject flipCoinObject = new FlipCoinObject();
        flipCoinObject.setLimit(40);
        utilities.Flip(flipCoinObject.getLimit());
    }
}
