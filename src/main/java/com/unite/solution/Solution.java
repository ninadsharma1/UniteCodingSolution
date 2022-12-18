package com.unite.solution;
/*
 *  Problem : Beautiful Days at the Movies
 *  Link : https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */

import java.util.Scanner;

/**
 * The type Solution. It contains the main function to invoke the code.
 */
public class Solution {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        try {
            Scanner stdin = new Scanner(System.in);
            // Taking input : Start range of number.
            int startDay = stdin.nextInt();
            // Taking input : End range of number.
            int endDay = stdin.nextInt();
            //Taking input divisor : Need to check if the number is evenly divided by divisor.
            int divisor = stdin.nextInt();
            //Creating the object for Beautiful days class and passing the arguments.
            BeautifulDays beautifulDays = new BeautifulDays();
            int result = beautifulDays.countBeautifulDaysInRange(startDay, endDay, divisor);
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println("Invalid input : " + exception.getMessage());
        }
    }
}
