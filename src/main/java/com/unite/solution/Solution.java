package com.unite.solution;
/*
 *  Problem : Beautiful Days at the Movies
 *  Link : https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */

import java.util.Scanner;

/**
 * The type Solution.
 */
public class Solution {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        System.out.println("Given a range of numbered days (i...j),  and a number k, " +
                "determine the number of days in the range that are beautiful. " +
                "Beautiful numbers are defined as numbers where |i - reverse(i)| is evenly divisible by k. " +
                "If a days value is a beautiful number, it is a beautiful day. " +
                "Return the number of beautiful days in the range");
        Scanner stdin = new Scanner(System.in);

        // Taking input : Start range of number.
        System.out.println("Enter the starting day :");
        int startDay = stdin.nextInt();

        // Taking input : End range of number.
        System.out.println("Enter the end day :");
        int endDay = stdin.nextInt();

        //Taking input divisor : Need to check if the number is evenly divided by divisor.
        System.out.println("Enter the divisor (k) :");
        int divisor = stdin.nextInt();

        //Creating the object for Beautiful days class and passing the arguments.
        BeautifulDays beautifulDays = new BeautifulDays();
        try {
            int result = beautifulDays.countBeautifulDaysInRange(startDay, endDay, divisor);
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println("Exception : "+ exception.getMessage());
        }
    }
}
