package com.unite.solution;

/**
 * The type Result.
 */
public class BeautifulDays {
    /**
     * Beautiful days int.
     *
     * @param startDay the
     * @param endDay the endDay
     * @param divisor the divisor
     * @return the int
     */
    public int countBeautifulDaysInRange(final int startDay, final int endDay, final int divisor) throws Exception {
        /*
        *  As mentioned in the hackerrank constraints : 1 <= startDay <= endDay <= 2 * 10^2
        */
        if(startDay < 1 || endDay < 1 || divisor < 1) {
            throw new Exception("Unable to process any negative range.");
        }
        if(startDay > 2000000 || endDay > 2000000) {
            throw new Exception("Unable to process range above 2 * 10^6.");
        }
        /*
         * Solution :
         * 1. Reverse the number using reverseDigit function.
         * 2. Calculate the absolute difference between the number and reversed number between the range.
         * 3. Keep track of the count of evenly divisible numbers and return the count.
        */
        int count = 0;
        for (int number = startDay; number <= endDay; number++) {
            int differenceBetweenNumbers = Math.abs(number - reverseDigits(number));
            if (differenceBetweenNumbers % divisor == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Revers digits int.
     *
     * @param number the number
     * @return the int
     */
    private static int reverseDigits(int number) {
        /*
         * Reverse digit function which convert and return the reverse of digit in the number.
         */
        int reverseNum = 0;
        while(number!=0) {
            reverseNum = reverseNum * 10 + number % 10;
            number = number / 10;
        }
        return reverseNum;
    }
}
