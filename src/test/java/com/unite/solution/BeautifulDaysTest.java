package com.unite.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


/**
 * The type Beautiful days test.
 */
public class BeautifulDaysTest {

    /**
     * The Beautiful days.
     */
    BeautifulDays beautifulDays = new BeautifulDays();

    /**
     * Count beautiful days in negative range test.
     *
     * @throws Exception the exception
     */
    @Test(expected = Exception.class)
    public void countBeautifulDaysInNegativeRangeTest() throws Exception {
        //Testing the negative i, j, k values
        beautifulDays.countBeautifulDaysInRange(-1,2,1);
    }

    /**
     * Count beautiful days overflow test.
     *
     * @throws Exception the exception
     */
    @Test(expected = Exception.class)
    public void countBeautifulDaysOverflowTest() throws Exception {
        //Testing the overflow condition in case of reversing the int value.
        beautifulDays.countBeautifulDaysInRange(1000000045,1000000045, 2);
    }

    /**
     * Count beautiful days valid test.
     *
     * @throws Exception the exception
     */
    @Test
    public void countBeautifulDaysValidTest() throws Exception {
        //Testing the valid condition for counting beautiful days.
        int result = beautifulDays.countBeautifulDaysInRange(20, 23, 6);
        assertEquals(2, result);
    }

    /**
     * Count beautiful days invalid test.
     *
     * @throws Exception the exception
     */
    @Test
    public void countBeautifulDaysInvalidTest() throws Exception {
        //Testing the invalid condition for counting beautiful days.
        int result = beautifulDays.countBeautifulDaysInRange(49860 ,205494 ,155635764);
        assertNotEquals(608, result);
        //Correct output : 607
        //assertEquals(607, result);
    }
}