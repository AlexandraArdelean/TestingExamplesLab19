package ro.fasttrackit;

import org.junit.Assert;
import org.junit.Test;



public class RecursionTest {
    @Test
    public void testSumOfDigitsForNegativeSingleDigitNumbers() {
        //setup
        int input = -4;
        //run
        int output = SumOfDigits.sumOfDigitsRecursive(input);
        //assert
        System.out.println(output == 4);
        Assert.assertEquals(4, output);

    }

    @Test
    public void testSumOfDigitsForNegativeTripleNumbers() {
        int input = -124;
        int output = SumOfDigits.sumOfDigitsRecursive(input);
        System.out.println(output == 7);
        Assert.assertEquals(7,output);
    }
}
