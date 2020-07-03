package kata.primefactors;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorsTest {

    @Test
    public void testOne() {
        List<Integer> expectedPrimes = new ArrayList<Integer>();
        Assert.assertEquals("List should be empty", expectedPrimes, PrimeFactors.generate(1));
    }

    @Test
    public void testTwo() {
        List<Integer> expectedPrimes = Arrays.asList(2);
        Assert.assertEquals("List should contains 2", expectedPrimes, PrimeFactors.generate(2));
    }

    @Test
    public void testThree() {
        List<Integer> expectedPrimes = Arrays.asList(3);
        Assert.assertEquals("List should contains 2", expectedPrimes, PrimeFactors.generate(3));
    }
}
